package class20;

public class Dog {

    String name;
    String breed;
    String color;
    int age;
    double weight;

    Dog (String dogName, String dogBreed, String dogColor, int dogAge, double dogWeight){
        name=dogName;
        breed=dogBreed;
        color=dogColor;
        age=dogAge;
        weight=dogWeight;


    }

    void printInfo () {
        System.out.println("Name: "+name+"; Breed: "+breed+"; Color: "+color+"; Age: "+age+"; Weight: "+weight);
    }

    public static void main(String[] args) {

        Dog husky=new Dog("Lucy", "Husky", "Grey", 5, 25.5 );
        husky.printInfo();

        Dog bulldog=new Dog("Nancy", "Bulldog", "Multi-Color", 6, 15);
        bulldog.printInfo();

        Dog labrador=new Dog ("Jackson", "Labrador", "Yellow", 7, 24);
        labrador.printInfo();


    }
}
