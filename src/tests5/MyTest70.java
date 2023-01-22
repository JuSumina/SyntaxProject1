package tests5;

public class MyTest70 {

    public static void main(String[] args) {

        for (int i=8; i>2; i--) {
            for (int j=1; j<i; j++) {
                System.out.print(j+" ");

            }
            if (i==3)
                break;
            System.out.println();
        }

        for (int i=1; i<9; i++) {
            for (int j=1; j<i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
