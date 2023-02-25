package class36;

import java.util.ArrayList;

public class ArrayList1 {

    public static void main(String[] args) {

        //Dog d1 = new Dog("Jacky", "Persian", 15);

        ArrayList <Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Jacky", "Persian", 15));
        dogs.add(new Dog("Jackie", "German", 5));
        dogs.add(new Dog("Jimmi", "Bulldog", 7));
        dogs.add(new Dog("Mimi", "Unknown", 10));

        for (Dog d:dogs) {
            d.printDogName();
        }

    }
}
