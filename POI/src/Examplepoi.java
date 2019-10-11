import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.formula.functions.Column;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;

public class Examplepoi {
    public static void main(String args[])throws IOException {
        HSSFWorkbook workbook = new HSSFWorkbook();
//Workbook wb = new Workbook();
        HSSFSheet sh = workbook.createSheet("java");

        Object[][] data = {

//                {"ggsgg","hdhj",1},
  //              {"dsf","hg",2},
                {"*"}
        };
        int rowCount = 0;
        for(int z=1;z<=5;z++){



                    for(Object[] cbook: data ) {
                        Row rw = sh.createRow(++rowCount);
                        int colCount = 0 ;
            for(int x=1;x<=z;x++) {
                for (Object vbook : cbook) {
                    Cell cl = rw.createCell(++colCount);
                    if (vbook instanceof String) {
                        cl.setBlank();
                        cl.setCellValue((String) vbook);



                    } else if (vbook instanceof Integer) {
                        cl.setBlank();
                        cl.setCellValue((Integer) vbook);
                    }


                }
            }
            }
        }
//workbook.close();

        try(FileOutputStream fo = new  FileOutputStream("test7.xls")){
            workbook.write(fo);
            fo.close();
        }catch(Exception e) {
            System.out.print("fefwe");
        }finally {
            workbook.close();
        }
    }


}

