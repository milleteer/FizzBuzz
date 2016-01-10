package CE_FileSize;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by gkoles on 2016.01.10..
 */
public class Main {

    public static void main(String[] args) {
        try {
            File file = new File("src/CE_FileSize/input.txt");
            //File file = new File(args[0]);
            System.out.println(file.length());
        }
        catch (Exception e){
            System.out.println("File not found");
            e.printStackTrace();
        }
    }
}
