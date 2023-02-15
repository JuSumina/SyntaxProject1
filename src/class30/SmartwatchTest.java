package class30;

public class SmartwatchTest {

    public static void main(String[] args) {

        Washable [] washables={new SmartWatch(), new Phone(), new Inverter()};

        for(Washable w:washables) {
            w.wash();
        }
    }
}
