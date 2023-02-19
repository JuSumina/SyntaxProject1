package tests9;

public abstract class Test159 {

    abstract void m1 ();

    abstract void m1 (int number);

    public static void main(String[] args) {
         Subclass md = new Subclass();
         md.m1();
         md.m1(5);
    }
}

class Subclass extends Test159 {

    @Override
    void m1() {
        System.out.println("m1 without parameters");
    }

    @Override
    void m1(int number) {
        System.out.println("m1 method with parameter");

    }
}
