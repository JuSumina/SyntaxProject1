package class32;
import class27.Car;
import class27.Tesla;
public class CarTest {

    public static void main(String[] args) {

        Bmw bmw = new Bmw ("Bmw", "X7");
        bmw.start();
        System.out.println(bmw.drive("smooth"));
        bmw.brake();

        Car car = new Car("SomeCar", "SomeModel");
        car.start();
        car.drive(90);


        Tesla tesla = new Tesla ("Tesla", "S", 2022, 350, "electric", true);
        tesla.start();
        tesla.drive(75);
        tesla.haveAutopilot();

        Car bmw1=new Bmw("Bmw","X77"); //upcasting
    }
}
