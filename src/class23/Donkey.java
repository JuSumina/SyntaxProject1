package class23;

public class Donkey {

    String name;
    int age;

    Donkey (String donkeyName, int donkeyAge){
        this.name=name;
        this.age=age;
        System.out.println("This is non argument constructor");
    }

    void print () {
        System.out.println("Donkey's name is "+name+", and his age is "+age);
    }
}
