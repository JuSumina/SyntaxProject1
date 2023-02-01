package homework15;

public class Phone1Tester {

    public static void main(String[] args) {

        Phone myPhone1=new Phone("iPhone", "12 Pro", "Space Grey", 2020);

        myPhone1.printInfo();

        Phone myPhone2=new Phone();
        myPhone2.printInfo();
    }
}
