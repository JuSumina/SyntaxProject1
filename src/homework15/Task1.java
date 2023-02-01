package homework15;

import class20.Dog;

public class Task1 {

    String name;
    String breed;
    String color;
    int age;
    double weight;

    Task1(String dogName, String dogBreed, String dogColor, int dogAge, double dogWeight) {
        name = dogName;
        breed = dogBreed;
        color = dogColor;
        age = dogAge;
        weight = dogWeight;


    }

    void printInfo() {
        System.out.println("Name: " + name + "; Breed: " + breed + "; Color: " + color + "; Age: " + age + "; Weight: " + weight);
    }

    public static void main(String[] args) {

        Dog husky = new Dog("Lucy", "Husky", "Grey", 5, 25.5);
        husky.printInfo();
    }
}
