package class34;

import java.util.ArrayList;

public class Boxing1 {

    public static void main(String[] args) {

        Integer integer = new Integer(10);
        int number1=integer; //it's autoboxing
        int number2=integer.intValue();//unboxing

        double d=12.3;
        Double wrapperD=new Double(d); //boxing
        Double wrapperP=d; //autoboxing

        Float f=12.4f;
        ArrayList<Double> arrayList = new ArrayList<>();
        arrayList.add(12.0);

        double fg=12;


    }
}
