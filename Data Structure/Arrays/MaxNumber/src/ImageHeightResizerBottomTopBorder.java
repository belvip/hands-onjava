import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class ImageHeightResizerBottomTopBorder {

    public static void cropHeightFromBottom(String inputImagePath, String outputImagePath, int heightReduction, int borderRadius) throws Exception {
        // Reads input image
        File inputFile = new File(inputImagePath);
        BufferedImage inputImage = ImageIO.read(inputFile);

        // Get original dimensions
        int originalWidth = inputImage.getWidth();
        int originalHeight = inputImage.getHeight();

        // Calculate new height
        int newHeight = originalHeight - heightReduction;

        // Crop the image (width remains the same, height is reduced from the bottom to top)
        BufferedImage croppedImage = inputImage.getSubimage(0, 0, originalWidth, newHeight);

        // Create a new buffered image with transparency (for border radius)
        BufferedImage outputImage = new BufferedImage(originalWidth, newHeight, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = outputImage.createGraphics();

        // Enable anti-aliasing for smoother edges
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Set the clipping area as a rounded rectangle
        g2.setClip(new RoundRectangle2D.Float(0, 0, originalWidth, newHeight, borderRadius, borderRadius));

        // Draw the cropped image within the rounded rectangle clip
        g2.drawImage(croppedImage, 0, 0, null);

        // Dispose graphics
        g2.dispose();

        // Writes to the output file with transparency (PNG format to preserve transparency)
        ImageIO.write(outputImage, "png", new File(outputImagePath));
    }

    public static void main(String[] args) {
        String inputImagePath = "C:\\Users\\belvinard\\Downloads\\visuels\\flyers_02.jpg";
        String outputImagePath = "C:\\Users\\belvinard\\Downloads\\visuels\\flyers_02_resized.jpg";
        int heightReduction = 60;  // The amount to reduce the height by
        int borderRadius = 25;  // The radius for the image corners

        try {
            cropHeightFromBottom(inputImagePath, outputImagePath, heightReduction, borderRadius);
            System.out.println("Image cropped and border radius added successfully!");
        } catch (Exception e) {
            System.out.println("Error processing the image.");
            e.printStackTrace();
        }
    }
}
