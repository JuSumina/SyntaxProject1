package tests9;

public class Test158 {

    final void method (boolean b) {
        System.out.println("Final method with boolean parameter");
    }

    final void method (String str) {
        System.out.println("Final method with String parameter");
    }

    public static void main(String[] args) {

        Test158 md = new Test158();
        md.method(true);
        md.method("true");
    }
}
