import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class GrayScaleEffect implements Effect{
	BufferedImage image;
    int width;
    int height;
	@Override
	public BufferedImage applyEffect(BufferedImage img) {
		try {
            File input = new File("images/Picture.jpg");
            
            image = ImageIO.read(input);
       
            width = image.getWidth();
            height = image.getHeight();

            for(int i=0; i<height; i++){
                
                for(int j=0; j<width; j++){

                    Color c = new Color(image.getRGB(j, i));
                    int red = (int)(c.getRed() * 0.299);
                    int green = (int)(c.getGreen() * 0.587);
                    int blue = (int)(c.getBlue() *0.114);
                    Color newColor = new Color(red+green+blue,
                    
                            red+green+blue,red+green+blue);

                    image.setRGB(j,i,newColor.getRGB());
                }
            }
            //File output = new File("grayscale.jpg");
            //obj.writeImage(image, output);
            
            
        } catch (Exception e) {}
		return image;
	}

}
