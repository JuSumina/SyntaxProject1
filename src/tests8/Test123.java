package tests8;

public class Test123 {

    static int [][] reduce10 (int[][] a) {
        int [][] result = new int[a.length][a[0].length];

        for (int i=0; i<a.length; i++) {
            for (int j=0; j<a[i].length; j++) {
                System.out.print((result[i][j]=a[i][j]-10)+" ");
            }
            System.out.println();
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] a = {
                {1,2,3,4},
                {4,5,6,7},
                {1,3,5,7}
        };
        reduce10(a);

        //create method reduce10 here

    }
}
