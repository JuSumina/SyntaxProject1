package tests9;

public class Test143 {

    public int sum2D (int [][] a) {

        int sum = 0;

    for (int i=0; i<a.length; i++) {
        for (int j=0; j<a[i].length; j++) {
            sum=a[i][j]+sum;
        }
    }
    return sum;
}

    public static void main(String[] args) {

        Test143 sum = new Test143();

        int[][] a = {

                { 1, 2, 3 },

                { 4, 5, 6 },

                { 7, 8, 9 }

        };

        System.out.println(sum.sum2D(a));

    }
}
