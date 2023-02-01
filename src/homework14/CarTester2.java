package homework14;

import homework15.Car;

public class CarTester2 {

    public static void main(String[] args) {

        //private - error
        //Car car1=new Car("Toyota", "Corola", "grey", 2022, 169);
        //System.out.println(car1.brand+" "+car1.model+" "+car1.color+" "+car1.year+" "+car1.horsepower+"hp");

        Car car2=new Car("Honda", "CRV", "black", 2020);
        System.out.println(car2.brand+" "+car2.model+" "+car2.color+" "+car2.year);

        //default - error
        //Car car3=new Car("BMW", "X3", "blue");
        //System.out.println(car3.brand+" "+car3.model+" "+car3.color);

        //protected - error
        //Car car4=new Car("Mercedes", "C300");
        //System.out.println(car4.brand+" "+car4.model);
    }
}
