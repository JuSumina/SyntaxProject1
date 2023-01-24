package tests5;

public class MyTest75 {

    public static void main(String[] args) {

        double[][] arr = {
                {1.4,2.0,3.3,2},
                {4,1.5,6.1,1},
                {1.2,3.1,4,1.6}
        };

        for (double [] arr1: arr) {
            for (double arr2: arr1) {
                System.out.print(arr2*2+" ");
            }
            System.out.println();
        }
    }
}
