package tests10;

import java.util.LinkedList;

public class Test174 {

    public static void main(String[] args) {

        LinkedList <Integer> fibonacci = new LinkedList<>();

        int num1=0;
        int num2=1;


        for (int i = 1; i <= 10; ++i) {
            fibonacci.add(num1);

            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }

        for (Integer numbers : fibonacci) {
            System.out.print(numbers + " ");
        }
    }
}
