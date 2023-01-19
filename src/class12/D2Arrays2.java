package class12;

import java.util.Arrays;

public class D2Arrays2 {

    public static void main(String[] args) {

        int[] [] matrix= {{10, 20, 30},
                         {45, 55, 66},
                         {30, 40, 20, 10, 25}
        };

        for (int i=0; i< matrix.length; i++) {
            for (int j=0; j< matrix[i].length; j++) {
                System.out.println(matrix[i] [j]);
            }
        }

    }
}
