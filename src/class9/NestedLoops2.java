package class9;

public class NestedLoops2 {

    public static void main(String[] args) {

        for (int i=0; i<5; i++) {
            for (int j=0; j<5; j++) {
                System.out.println("i = "+i+ " j = "+j);
            }

            System.out.println("********");
        }
    }
}
