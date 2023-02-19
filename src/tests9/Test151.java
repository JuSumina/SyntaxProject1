package tests9;

public class Test151 {

    private void m1 () {

        System.out.println("private m1 method");

    }

    private void m1 (int number) {

        System.out.println("private m1 method with int parameter "+number);

    }

    public static void main(String[] args) {

        Test151 md = new Test151();
        md.m1();
        md.m1(5);
    }
}
