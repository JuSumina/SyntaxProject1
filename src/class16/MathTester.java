package class16;

import java.util.Scanner;

public class MathTester {

    public static void main(String[] args) {
        Math math=new Math();

        math.sum(10,10);

        math.mult(3, 4,5);

        int result=math.sub(100,50);
        System.out.println(result);

    }
}
