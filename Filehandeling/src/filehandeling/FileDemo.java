package filehandeling;

import java.io.FileWriter;
import java.io.File;
public class FileDemo {
//public class FileWriterExample {

    private static final String FOLDER ="D:\\Demo\\";
    public static void main(String args[]){
        try{
            File newFolder=new File(FOLDER);
            boolean created =  newFolder.mkdirs();
            FileWriter fw=new FileWriter("testout.txt");
            fw.write("Welcome to java File handeling program.");
            fw.close();
        }catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("Success....");
    }
}
