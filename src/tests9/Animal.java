package tests9;



public class Animal {

    String type;
    String color;
    int age;

    Animal(String type, String color, int age) {
        this.type = type;
        this.color = color;
        this.age = age;

    }

    void eat() {
        System.out.println("Animal eats");
    }

    void sleep() {
        System.out.println("Animal sleeps");
    }

    public static void main(String[] args) {

        Animal[] animals = {new Cat("cat", "grey", 2), new kitten1("kitten", "black", 1), new kitten2("kitten", "white", 1), new kitten3("kitten", "multicolor", 1)};

        for (Animal animal : animals) {
            animal.eat();
            animal.sleep();
        }
    }
}

class Cat extends Animal {
    public Cat(String type, String color, int age) {
        super(type, color, age);
    }

    void eat() {
        System.out.println("Cat eats");
    }

    @Override
    void sleep() {
        System.out.println("Cat sleeps a lot");
    }
}

class kitten1 extends Animal {
    public kitten1(String type, String color, int age) {
        super(type, color, age);
    }

    @Override
    void eat() {
        System.out.println("kitten1 eats milk");
    }

    @Override
    void sleep() {
        System.out.println("kitten1 sleeps a lot");
    }
}

class kitten2 extends Animal {
    public kitten2(String type, String color, int age) {
        super(type, color, age);
    }

    @Override
    void eat() {
        System.out.println("kitten2 eats snacks");
    }

    @Override
    void sleep() {
        System.out.println("kitten2 sleeps a lot");
    }
}

class kitten3 extends Animal {
    public kitten3(String type, String color, int age) {
        super(type, color, age);
    }

    @Override
    void eat() {
        System.out.println("kitten3 eats everything");
    }

    @Override
    void sleep() {
        System.out.println("kitten3 sleeps a lot");
    }
}