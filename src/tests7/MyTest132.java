package tests7;

import class19.Students;

public class MyTest132 {

    static int numberOfInstances=0;

    public static void main(String[] args) {

        MyTest132 inst1=new MyTest132();
        inst1.numberOfInstances++;

        MyTest132 inst2=new MyTest132();
        inst2.numberOfInstances++;

        MyTest132 inst3=new MyTest132();
        inst3.numberOfInstances++;

        System.out.println(MyTest132.numberOfInstances);
    }
}
