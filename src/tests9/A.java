package tests9;

public class A {

    A () {
        System.out.println("I");
    }

    public static void main(String[] args) {

        C c = new C();

    }
}

class B extends A {
    B () {
        System.out.println("am");;
    }
}

class C extends B
{
    C () {
        System.out.println("a tester");
    }
}