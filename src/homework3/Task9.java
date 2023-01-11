package homework3;

import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        double num1, num2, result;
        System.out.println("Please enter any two numbers");
        num1=scanner.nextDouble();
        num2=scanner.nextDouble();

        System.out.println("Please enter any operator from +,-,*,/");
        char operator=scanner.next().charAt(0);

        switch(operator) {

            case '+':
                result = num1 + num2;
                System.out.println(num1+" + "+num2+" = "+result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println(num1+" - "+num2+" = "+result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println(num1+" * "+num2+" = "+result);
                break;
            case '/':
                result = num1 / num2;
                System.out.println(num1+" / "+num2+" = "+result);
                break;

        }



    }
}
