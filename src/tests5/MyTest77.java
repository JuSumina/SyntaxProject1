package tests5;

public class MyTest77 {

    public static void main(String[] args) {

        int[][] a = {
                {-5,-2,-3,7},
                {1,-5,-2, 2},
                {1,-2, 3,-4}
        };


        int sum=0;

        for (int i=0; i<a.length; i++) {
            for (int j=0; j<a.length; j++) {
                sum=sum-j;
            }


        }
        System.out.println(sum);

    }
}
