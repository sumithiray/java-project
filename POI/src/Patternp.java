import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.formula.functions.Column;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.junit.Test;

public class Patternp {

    public static void main(String args[]) throws IOException {
        HSSFWorkbook workbook = new HSSFWorkbook();
//Workbook wb = new Workbook();
        HSSFSheet sh = workbook.createSheet("java");



        int rowCount = 0;
        int colCount=0;
        for(int i=1;i<=8;i++) {
            Row rw = sh.createRow(rowCount++);
                for (int j = 1; j < i; j++) {
                    Cell cl = rw.createCell(colCount++);
                    if (rowCount==colCount) {
                        cl.setCellValue("*");
                    }
                }
        }



        try(FileOutputStream fo = new  FileOutputStream("test5.xls")){
            workbook.write(fo);
            fo.close();
        }catch(Exception e) {
            System.out.print("fefwe");
        }finally {
            workbook.close();
        }
    }
}
