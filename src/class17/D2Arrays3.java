package class17;

public class D2Arrays3 {

    public static void main(String[] args) {

        int [][] array={
                {1, 2, 3},
                {11, 12, 13},
                {20, 21, 22},
                {100, 101}
        };

        for (int row=0; row< array.length; row++) {
            for (int column=0; column<array[row].length; column++) {
                if (row % 2 != 0) {
                    System.out.print(array[row][column] + " ");
                }
            }
            System.out.println();
        }





    }
}
