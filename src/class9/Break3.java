package class9;

import java.sql.SQLOutput;

public class Break3 {

    public static void main(String[] args) {

        boolean summer = true;

        for (int temp = 75; temp<=100; temp+=5) {
            if (summer) {
                System.out.println("I love summer because tempreature is " + temp);
            } else if (temp>100) {
                System.out.println("It's very hot " + temp);
            }
            }
    }
}
