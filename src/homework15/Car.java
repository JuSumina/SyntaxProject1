package homework15;

public class Car {

    public String brand;
    public String model;
    public String color;
    public int year;
    public int horsepower;

    private Car (String carBrand, String carModel, String carColor, int carYear, int carHorsepower) {
        brand=carBrand;
        model=carModel;
        color=carColor;
        year=carYear;
        horsepower=carHorsepower;
    }

    public Car (String carBrand, String carModel, String carColor, int carYear) {
        brand=carBrand;
        model=carModel;
        color=carColor;
        year=carYear;
    }

    Car (String carBrand, String carModel, String carColor) {
        brand=carBrand;
        model=carModel;
        color=carColor;
    }

    protected Car (String carBrand, String carModel) {
        brand=carBrand;
        model=carModel;

    }


    public static void main(String[] args) {

        Car car1=new Car("Toyota", "Corola", "grey", 2022, 169);
        System.out.println(car1.brand+" "+car1.model+" "+car1.color+" "+car1.year+" "+car1.horsepower+"hp");

        Car car2=new Car("Honda", "CRV", "black", 2020);
        System.out.println(car2.brand+" "+car2.model+" "+car2.color+" "+car2.year);

        Car car3=new Car("BMW", "X3", "blue");
        System.out.println(car3.brand+" "+car3.model+" "+car3.color);

        Car car4=new Car("Mercedes", "C300");
        System.out.println(car4.brand+" "+car4.model);

    }
}
