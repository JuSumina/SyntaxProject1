package exceldemo;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelDemo1 {

    public static void main(String[] args) throws IOException {

        String path="D:\\Syntax\\For Java Classes\\Excel\\Excel_Demo_1.xlsx";
        FileInputStream fileInputStrem=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStrem);


    }
}
