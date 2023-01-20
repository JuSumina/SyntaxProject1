package class13;

public class Loops8 {

    public static void main(String[] args) {

        for (int i=0; i<=3; i++) {
            System.out.println(i);
            if (i==3) {
                break;
            }
            for (int j=0; j>=3; j++) {
                System.out.println(j);
            }
        }
    }
}
