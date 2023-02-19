package tests9;

public class Test152 {
    static void method () {
        System.out.println("static method without parameter");
    }

    static void method (int num) {
        System.out.println("static method with int parameter "+num);
    }

    public static void main(String[] args) {
        Test152.method();
        Test152.method(2);
    }
}
