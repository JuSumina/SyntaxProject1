package homework9;

public class Task5 {

    public static void main(String[] args) {

        int[] [] arr= {{2, 17, 3,9},
                {4, 22, 5, 1},
                {7, 8, 9, 12}
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 0) {
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }

    }
}
