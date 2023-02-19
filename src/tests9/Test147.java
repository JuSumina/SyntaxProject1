package tests9;

public class Test147 {

    void m1 () {
        System.out.println("m1 method in parent class");
    }

    public static void main(String[] args) {

        Child1 c = new Child1 ();
        c.m2();
    }
}

class Child1 extends Test147 {
    void m1 () {
        System.out.println("m1 method in child class");
    }

    void m2 () {
        m1();
        super.m1();
    }
}


