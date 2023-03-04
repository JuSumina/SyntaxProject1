package class39;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileWrite2 {

    public static void main(String[] args) throws IOException {

        String path = "Files/student.properties";
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        Properties properties = new Properties();
        properties.setProperty("Name", "Julia");
        properties.setProperty("Last Name", "Sumina");
        properties.setProperty("Student ID", "12785");
        properties.store(fileOutputStream, "A new student has been added");




    }
}
