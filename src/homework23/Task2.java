package homework23;

import java.util.ArrayList;

public class Task2 {

    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();

        cars.add("Toyota");
        cars.add("Audi");
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Porsche");

        System.out.println(cars);

        for (String car:cars) {
            System.out.print(car+" ");
        }

        System.out.println();

        int i =0;
        while (i< cars.size()) {
            System.out.print(cars.get(i)+" ");
            i++;
        }
    }
}
