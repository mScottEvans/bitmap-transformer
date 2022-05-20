package bitmap.transformer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import javax.imageio;
public class Bitmap {
    public Bitmap(String srcFileName, String outputFileName){
        src_file_name = srcFileName;
        output_file_name = outputFileName;
    }
    public void loadFile(){
        bufferedImage = null;
//        Path dir = Paths.get(src_file_name);
        File file = new File(src_file_name);
        if (file.exists()) {
//            Path path = dir.resolve(src_file_name);
            try{
                bufferedImage = ImageIO.read(new File(src_file_name));

            } catch (IOException e) {
                System.out.println("An error has occurred; " + e.getMessage());
            }


        }


    }


    public BufferedImage bufferedImage;
    public String src_file_name;
    public String output_file_name;

}
