package class27;

public class Tesla extends Car {

    String type;
    boolean autoPilot;

    Tesla (String make, String model, int year, int horsePower, String type, boolean autoPilot) {
        super(make, model, year, horsePower);
        this.type=type;
        this.autoPilot=autoPilot;


    }

    protected void haveAutopilot () {
        System.out.println(make+" have auto pilot "+autoPilot);
    }
}
