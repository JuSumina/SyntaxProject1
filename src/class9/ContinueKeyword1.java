package class9;

public class ContinueKeyword1 {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i % 3 == 0) {
                continue;
            } else {
                System.out.println(i);
            }

            System.out.println("Hello Java");
        }
    }
}