package tests9;

public class Test153 {

    public void hello() {
        System.out.println("method in Parent class");
    }

    public static void main(String[] args) {

        Child11 child1 = new Child11();
        child1.hello();

        Child22 child2 = new Child22();
        child2.hello();

        Child33 child3 = new Child33();
        child3.hello();


    }
}
class Child11 extends Test153 {
    @Override
    public void hello() {
        System.out.println("method in Child1 class");
    }
}

class Child22 extends Test153 {
    @Override
    public void hello() {
        System.out.println("method in Child2 class");
    }
}

class Child33 extends Test153 {
    @Override
    public void hello() {
        System.out.println("method in Child3 class");
    }
}