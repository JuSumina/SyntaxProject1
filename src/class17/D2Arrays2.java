package class17;

public class D2Arrays2 {

    public static void main(String[] args) {

        int [][] array={
                {1, 2, 3},
                {11, 12, 13},
                {20, 21, 22},
                {100, 101}
        };

        for (int [] arr:array) {
            for (int element:arr) {
                if (element%2==0) {
                    System.out.print(element + " ");
                }
            }
            System.out.println();
        }





    }
}
