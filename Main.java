

public class Main {

    static public void main(String args[]) throws Exception
    {
        //GrayScale obj = new GrayScale();
        ImageLoader myLoader = new ImageLoader();

        ImageDocument newImage = myLoader.loadImage();

        ImageShop myShop = new ImageShop(newImage);

        EffectLibrary obj = new EffectLibrary("grayscale");



    }


}