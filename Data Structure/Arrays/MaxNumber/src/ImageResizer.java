import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class ImageResizer {

    public static void resize(String inputImagePath, String outputImagePath, int scaledWidth, int scaledHeight) throws Exception {
        // Reads input image
        File inputFile = new File(inputImagePath);
        BufferedImage inputImage = ImageIO.read(inputFile);

        // Creates output image with desired dimensions
        BufferedImage outputImage = new BufferedImage(scaledWidth, scaledHeight, inputImage.getType());

        // Get the Graphics2D object for drawing the resized image
        Graphics2D g2d = outputImage.createGraphics();

        // Apply rendering hints for high-quality image rendering
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Draw the resized image
        g2d.drawImage(inputImage, 0, 0, scaledWidth, scaledHeight, null);
        g2d.dispose();

        // Writes to the output file
        ImageIO.write(outputImage, "jpg", new File(outputImagePath));
    }

    public static void main(String[] args) {
        String inputImagePath = "C:\\Users\\belvinard\\Downloads\\visuels\\Flyers - Facture CIE SODECI - AFB - present.jpg";
        String outputImagePath = "C:\\Users\\belvinard\\Downloads\\visuels\\Flyers_resized.jpg";
        int scaledWidth = 800;  // Set your desired width
        int scaledHeight = 600; // Set your desired height

        try {
            resize(inputImagePath, outputImagePath, scaledWidth, scaledHeight);
            System.out.println("Image resized successfully with high quality!");
        } catch (Exception e) {
            System.out.println("Error resizing the image.");
            e.printStackTrace();
        }
    }
}
