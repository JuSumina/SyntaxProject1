package tests7;

import tests.MyTest13;

public class MyTest130 {

    int phoneYear;
    String phoneBrand;
    double softwareVersion;
    boolean softwareUpToDate;
    float phonePrice;

    void printInfo () {
        System.out.println(phoneYear);
        System.out.println(phoneBrand);
        System.out.println(softwareVersion);
        System.out.println(softwareUpToDate);
        System.out.println(phonePrice);
    }

    public static void main(String[] args) {

        MyTest130 md=new MyTest130();
        md.printInfo();


    }
}
