package tests9;

public class Test150 {

    Test150 (int number) {
        System.out.println(number);
    }

    Test150 (double number) {
        System.out.println(number);
    }

    public static void main(String[] args) {

        Test150 md1 = new Test150(100);

        Test150 md2 = new Test150(100.09);

    }
}
