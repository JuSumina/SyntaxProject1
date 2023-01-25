package homework11;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter mom's first name");
        String momName=scanner.next();
        System.out.println("Mom's first name is "+momName);
        System.out.println("Please enter dad's first name");
        String dadName=scanner.next();
        System.out.println("Dad's first name is "+dadName);

        System.out.println("Are "+momName+" and "+dadName+" are having a girl or a boy?");
        String babyGender= scanner.next();

        String momNameHalf1=momName.substring(0,momName.length()/2);
        String dadNameHalf1=dadName.substring(0,dadName.length()/2);

        String momNameHalf2=momName.substring(momName.length()/2);
        String dadNameHalf2=dadName.substring(dadName.length()/2);

        if (babyGender.equalsIgnoreCase("girl")) {
            System.out.println((dadNameHalf1+momNameHalf2).toUpperCase());

        } else if (babyGender.equalsIgnoreCase("boy")) {
            System.out.println((momNameHalf1+dadNameHalf2).toUpperCase());

        }



    }
}
