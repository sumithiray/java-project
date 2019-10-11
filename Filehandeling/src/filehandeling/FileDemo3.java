package filehandeling;

import java.io.*;

public class FileDemo3 {
    public static void main(String args[]) throws Exception {
        BufferedReader objReader = null;
            String strCurrentLine;
            objReader = new BufferedReader(new FileReader("D:\\Demo2\\test.txt"));
            while ((strCurrentLine = objReader.readLine()) != null) {
                //System.out.println(strCurrentLine);
                int result = Integer.parseInt(strCurrentLine);
                String st1="*";
//                for(int i=1;i<=result;i++) {
//                    for (int j=1;j<=i;j++) {
//                      if(i>=2 && j<=i-1) {
//                          System.out.print(" ");
//                    }   }
//                    System.out.println(st1);
//                }
                String dir = "D:\\Demo3\\test.txt";
                File directory = new File(dir);
                directory.getParentFile().mkdir();
                directory.createNewFile();

                FileWriter fw=new FileWriter(directory);
                //while (result==5)
                  for (int k=1;k<=result;k++) {
                      for (int j=1;j<=k;j++) {
                          if(k>=2 && j<=k-1) {
                              fw.write(" ");
                                fw.l
                          }  fw.write("\n"); }
                      fw.write(st1);
                  }
                //BufferedWriter writer = new BufferedWriter(new FileWriter("test.txt"));
                //writer.write(strCurrentLine);
                fw.close();
            }   }   }