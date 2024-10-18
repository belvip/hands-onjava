import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class ImageWidthResizer {

    public static void increaseWidth(String inputImagePath, String outputImagePath, int widthIncrease, int borderRadius) throws Exception {
        // Reads input image
        File inputFile = new File(inputImagePath);
        BufferedImage inputImage = ImageIO.read(inputFile);

        // Get original dimensions
        int originalWidth = inputImage.getWidth();
        int originalHeight = inputImage.getHeight();

        // Calculate new width
        int newWidth = originalWidth + widthIncrease;

        // Create a new buffered image with transparency (for border radius)
        BufferedImage outputImage = new BufferedImage(newWidth, originalHeight, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = outputImage.createGraphics();

        // Enable anti-aliasing and high-quality rendering for better image quality
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);

        // Set the clipping area as a rounded rectangle
        g2.setClip(new RoundRectangle2D.Float(0, 0, newWidth, originalHeight, borderRadius, borderRadius));

        // Draw the original image scaled to the new width and original height
        g2.drawImage(inputImage, 0, 0, newWidth, originalHeight, null);

        // Dispose graphics
        g2.dispose();

        // Writes to the output file with transparency (PNG format to preserve transparency)
        ImageIO.write(outputImage, "png", new File(outputImagePath));
    }

    public static void main(String[] args) {
        String inputImagePath = "C:\\Users\\belvinard\\Downloads\\visuels\\LE_SAVIEZ_VOUS_4.jpg";
        String outputImagePath = "C:\\Users\\belvinard\\Downloads\\visuels\\LE_SAVIEZ_VOUS_resized_4.jpg";
        int widthIncrease = 100;  // The amount to increase the width by
        int borderRadius = 25;  // The radius for the image corners

        try {
            increaseWidth(inputImagePath, outputImagePath, widthIncrease, borderRadius);
            System.out.println("Image width increased and border radius added successfully!");
        } catch (Exception e) {
            System.out.println("Error processing the image.");
            e.printStackTrace();
        }
    }
}
