package tests9;

public abstract class Test160 {

    abstract void m1();
    void m2() {
        System.out.println("Parent class providing implementation");
    }

    public static void main(String[] args) {

        Test160Child md = new Test160Child();
        md.m1();
        md.m2();

    }

}

class Test160Child extends Test160 {

    @Override
    void m1() {
        System.out.println("Child class providing implementation");
    }
}
