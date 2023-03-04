package class39;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelReader4 {

    public static void main(String[] args) throws IOException {

        String path = "D:\\Syntax\\For Java Classes\\Syntax Project 1\\Files\\Book1.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet1=xssfWorkbook.getSheet("Sheet1");

        int rowSize=sheet1.getPhysicalNumberOfRows();

        List<Map<String, String>> excelData=new ArrayList<>();

        for (int i=1; i < rowSize; i++) {
            Row row = sheet1.getRow(i);
            LinkedHashMap rowMap=new LinkedHashMap();
            rowMap.put("Name", row.getCell(0));
            rowMap.put("Age", row.getCell(1));
            rowMap.put("City", row.getCell(2));
            rowMap.put("Salary", row.getCell(3));
            excelData.add(rowMap);
        }
    }
}
