package class22;

public class Flower {


    //attributes, properties in form of instance variables

    static boolean pretty=true;
    String color, name;
    int price;

    //behavior in form of methods

    void smell() {
        System.out.println(name+" smells good");
    }

    void bloom () {
        System.out.println(name+ "flower blooms");
    }

    void grow() {
        System.out.println(name+" flower grows");
    }

}
