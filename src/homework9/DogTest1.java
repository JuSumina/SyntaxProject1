package homework9;

public class DogTest1 {

    public static void main(String[] args) {

        Dog dog1 = new Dog();


        dog1.breed = "Husky";
        dog1.name = "Echo";
        dog1.color = "Black and White";
        dog1.behavior = false;

        dog1.bark();


        Dog dog2 = new Dog();


        dog2.breed = "Bulldog";
        dog2.name = "Hunter";
        dog2.color = "Brown and White";
        dog2.behavior = true;

        dog2.reward();


        Dog dog3 = new Dog();


        dog3.breed = "Labrador";
        dog3.name = "Coco";
        dog3.color = "Chocolate";
        dog3.behavior = true;

        dog3.fetch();

    }
}
