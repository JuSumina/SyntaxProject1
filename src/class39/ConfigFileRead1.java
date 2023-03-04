package class39;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileRead1 {

    public static void main(String[] args) throws IOException {

        String path="Files/config.properties";
        //class that helps us navigate to that folder where file is stored
        FileInputStream fileInputStream = new FileInputStream(path);

        Properties properties = new Properties();
        properties.load(fileInputStream);
        System.out.println(properties.get("user"));
        System.out.println(properties.get("password"));
        System.out.println(properties.get("URL"));
        System.out.println(properties.get("browser"));
        fileInputStream.close();



    }
}
