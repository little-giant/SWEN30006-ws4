import java.awt.image.BufferedImage;

public class ImageDocument {

    public BufferedImage image;
    public int height;
    public int width;
    public String outputFile;

    public ImageDocument(BufferedImage image, int width, int height){
        this.image = image;
        this.width = width;
        this.height = height;
       
    }
    
    
}