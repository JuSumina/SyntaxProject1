package class14;

public class CarTester {

    public static void main(String[] args) {

        Car bmw=new Car();
        bmw.make="BMW";
        bmw.model="i7";
        bmw.year=2023;
        bmw.color="Grey";


        bmw.moveForward();
        bmw.applyBrakes();

        Car audi=new Car();
        audi.make="Audi";
        audi.model="A3";
        audi.year=2023;
        audi.color="Black";




    }
}
