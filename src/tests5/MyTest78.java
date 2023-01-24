package tests5;

public class MyTest78 {

    public static void main(String[] args) {

        int[][] a = {
                {1,1,2}, //sum = 4
                {3,1,2}, //sum = 6
                {3,5,3}, //sum = 11
                {0,1,2}  //sum = 3
        };



        for (int i=0; i<a[i].length+1; i++) {
            int rowSums=0;
            for (int j = 0; j < a[j].length; j++) {
                rowSums = rowSums+a[i][j];
            }
            System.out.println(rowSums);
        }
            System.out.println();
        }
    }

