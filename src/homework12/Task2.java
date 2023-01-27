package homework12;

import java.sql.SQLOutput;

public class Task2 {

    public static void main(String[] args) {

        String str="If you want to win $$$ you NEED to hit 777!";

        String updatedStr = str.replaceAll("[^A-Za-z0-9]", "");
        int alphanumericCount = updatedStr.length();
        System.out.println("Number of alphanumeric characters is " + alphanumericCount);

    }
}
