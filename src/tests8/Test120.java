package tests8;

public class Test120 {

    static String country;
    static String continent;

    void printInfo () {
        System.out.println(country+" located on "+continent+" continent");
    }

    public static void main(String[] args) {

        Test120 info = new Test120();
        Test120.country="Ukraine";
        Test120.continent="Europe";

        info.printInfo();
    }
}
