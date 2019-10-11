package filehandeling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo2 {
       public static void main (String [] args) throws IOException {
           String dir = "D:\\Demo2\\test.txt";
           File directory = new File(dir);
            directory.getParentFile().mkdir();
            directory.createNewFile();

                FileWriter fw=new FileWriter(directory);
                fw.write("5");
                fw.close();
       }

}