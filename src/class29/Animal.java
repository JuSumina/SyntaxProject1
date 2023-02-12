package class29;

public abstract class Animal {

    abstract void speak ();
    abstract void eat ();
}

class Dog extends Animal{
    @Override
    public void speak() {
        System.out.println("Dog speaks");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats");
    }
}

class Cat extends Animal{
    @Override
    public void speak() {
        System.out.println("Cat speaks");
    }

    @Override
    public void eat() {
        System.out.println("Cat eats");
    }
}

class Horse extends Animal{
    @Override
    public void speak() {
        System.out.println("Horse speaks");
    }

    @Override
    public void eat() {
        System.out.println("Horse eats");
    }
}
