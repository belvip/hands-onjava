

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class ImageHeightResizerBottomTop {

    public static void cropHeightFromBottom(String inputImagePath, String outputImagePath, int heightReduction) throws Exception {
        // Reads input image
        File inputFile = new File(inputImagePath);
        BufferedImage inputImage = ImageIO.read(inputFile);

        // Get original dimensions
        int originalWidth = inputImage.getWidth();
        int originalHeight = inputImage.getHeight();

        // Calculate new height
        int newHeight = originalHeight - heightReduction;

        // Crop the image (width remains the same, height is reduced from the bottom to top)
        BufferedImage outputImage = inputImage.getSubimage(0, 0, originalWidth, newHeight);

        // Writes to the output file
        ImageIO.write(outputImage, "jpg", new File(outputImagePath));
    }

    public static void main(String[] args) {
        String inputImagePath = "C:\\Users\\belvinard\\Downloads\\visuels\\master_carte.jpg";
        String outputImagePath = "C:\\Users\\belvinard\\Downloads\\visuels\\master_carte_resized.jpg";
        int heightReduction = 60;  // The amount to reduce the height by

        try {
            cropHeightFromBottom(inputImagePath, outputImagePath, heightReduction);
            System.out.println("Image cropped successfully from bottom to top!");
        } catch (Exception e) {
            System.out.println("Error cropping the image.");
            e.printStackTrace();
        }
    }
}
