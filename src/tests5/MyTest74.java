package tests5;

public class MyTest74 {

    public static void main(String[] args) {

        double [][] arr= {{1.4, 2.0, 3.3, 2.0},
                {4.0, 1.5, 6.1, 1.0},
                {1.2, 3.1, 4.0, 1.6},
        };

        for (double [] arr1: arr) {
            for (double arr2: arr1) {
                System.out.print(arr2+" ");
            }
            System.out.println();
        }

    }


}
