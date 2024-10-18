import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriter;
import javax.imageio.stream.ImageOutputStream;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

public class ImageResizerSize {
    public static void main(String[] args) throws IOException {
        // Path of the input image and output image
        String inputImagePath = "C:\\Users\\belvinard\\Downloads\\visuels\\DYS2.jpg";
        String outputImagePath = "C:\\Users\\belvinard\\Downloads\\visuels\\DYS2_resized.jpg";

        // Load the input image
        File inputFile = new File(inputImagePath);
        BufferedImage inputImage = ImageIO.read(inputFile);

        // Target file size in KB (500KB)
        long targetSizeKB = 500;
        long targetSizeBytes = targetSizeKB * 1024; // Convert KB to bytes

        // Maintain 100% quality for the image
        float quality = 1.0f;
        int width = inputImage.getWidth();
        int height = inputImage.getHeight();

        // Reduce image dimensions until the file size is below 500KB
        while (true) {
            // Resize the image
            BufferedImage resizedImage = resizeImage(inputImage, width, height);

            // Save the resized image to ByteArrayOutputStream without compression
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            saveImage(resizedImage, outputStream);

            // Check the size of the output image in bytes
            long imageSize = outputStream.size();
            System.out.println("Image size: " + imageSize / 1024 + "KB");

            // If the image is below the target size, save and exit
            if (imageSize <= targetSizeBytes) {
                // Write the image to a file
                try (FileOutputStream fos = new FileOutputStream(outputImagePath)) {
                    outputStream.writeTo(fos);
                }
                System.out.println("Image resized successfully: " + outputImagePath);
                break;
            }

            // Reduce the size by reducing dimensions
            width *= 0.9; // Reduce width by 10%
            height *= 0.9; // Reduce height by 10%

            if (width <= 1 || height <= 1) {
                System.out.println("Cannot reduce image size further without loss of resolution.");
                break;
            }
        }
    }

    // Method to resize the image
    private static BufferedImage resizeImage(BufferedImage originalImage, int targetWidth, int targetHeight) {
        Image scaledImage = originalImage.getScaledInstance(targetWidth, targetHeight, Image.SCALE_SMOOTH);
        BufferedImage resizedImage = new BufferedImage(targetWidth, targetHeight, originalImage.getType());

        Graphics2D g2d = resizedImage.createGraphics();
        g2d.drawImage(scaledImage, 0, 0, null);
        g2d.dispose();
        return resizedImage;
    }

    // Method to save an image with no compression (100% quality)
    private static void saveImage(BufferedImage image, ByteArrayOutputStream outputStream) throws IOException {
        Iterator<ImageWriter> writers = ImageIO.getImageWritersByFormatName("jpg");
        ImageWriter writer = writers.next();

        try (ImageOutputStream ios = ImageIO.createImageOutputStream(outputStream)) {
            writer.setOutput(ios);
            writer.write(new IIOImage(image, null, null));
        }
    }
}
