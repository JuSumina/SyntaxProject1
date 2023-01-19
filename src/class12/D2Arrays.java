package class12;

import java.util.Arrays;

public class D2Arrays {

    public static void main(String[] args) {

        /*DataType [] [] nameofArray = new DataType [SizeofRows] [];

        DataType [] [] nameofArray = {{1,2,3} {4,5,6}};*/

        int[] [] matrix= {{10, 20, 30},
                         {45, 55, 66},
                         {30, 40, 20, 10, 25}
        };

        System.out.println(matrix[2][4]);
        System.out.println(Arrays.toString(matrix[0]));

        for (int i=0; i<matrix[0].length; i++) {
            System.out.println(matrix[0][i]);
        }

        int[] arr=matrix[0];
        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println(Arrays.toString(matrix[2]));

    }
}
