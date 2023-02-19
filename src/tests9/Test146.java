package tests9;

public class Test146 {

    int i=10;
}

class D extends Test146 {

    int i=20;

    void printInfo () {
        System.out.println(i);
        System.out.println(super.i);
    }

    public static void main(String[] args) {

        D b = new D();
        b.printInfo();
    }
}
