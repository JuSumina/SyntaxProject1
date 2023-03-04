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

public class ExcelReader3 {

    public static void main(String[] args) throws IOException {

        LinkedHashMap <String, String> row1=new LinkedHashMap<>();
        row1.put("Name", "Julia");
        row1.put("Age", "30");
        row1.put("City", "New York");
        row1.put("Salary", "175000");

        LinkedHashMap <String, String> row2=new LinkedHashMap<>();
        row2.put("Name", "Joe");
        row2.put("Age", "60");
        row2.put("City", "Huston");
        row2.put("Salary", "125000");

        LinkedHashMap <String, String> row3=new LinkedHashMap<>();
        row3.put("Name", "Jane");
        row3.put("Age", "645");
        row3.put("City", "Los Angeles");
        row3.put("Salary", "109000");

        List<Map<String, String>> allRows=new ArrayList<>();
        allRows.add(row1);
        allRows.add(row2);
        allRows.add(row3);

        System.out.println(allRows);


    }
}
