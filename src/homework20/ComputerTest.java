package homework20;

public class ComputerTest {

    public static void main(String[] args) {

        Computer[] computers = {new Apple(), new Lenovo(), new HP(), new Dell()};
        for (Computer computer: computers) {
            computer.turnOn();
            computer.turnOff();
            computer.restart();
        }
    }
}
