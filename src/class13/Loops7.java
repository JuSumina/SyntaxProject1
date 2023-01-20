package class13;

public class Loops7 {

    public static void main(String[] args) {

        for (int i=0; i<2; i++) {
            System.out.println("*");
                System.out.println(" ");
            }

        for (int i=1; i<4; i++) {
            System.out.println("*");
            if (i==3) {
                break;
            }
            for (int j=0; j<1; j++) {
                System.out.println("**");
            }
        }
    }
}
