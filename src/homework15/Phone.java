package homework15;

public class Phone {

    String brand;
    String model;
    String color;
    int year;

    Phone(String phoneBrand, String phoneModel, String phoneColor, int phoneYear) {
        brand=phoneBrand;
        model=phoneModel;
        color=phoneColor;
        year=phoneYear;
    }

    Phone () {

    }

    void printInfo() {
        System.out.println("I have "+color+" "+brand+" "+model+" from "+year);
    }
}
