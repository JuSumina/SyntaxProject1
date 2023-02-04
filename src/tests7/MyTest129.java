package tests7;

public class MyTest129 {

    String countryName;
    String capital;
    int populationSize;

    void printInfo() {
        System.out.println("The "+capital+" of "+countryName+" is Washington DC and population is "+populationSize);
    }



    public static void main(String[] args) {

        MyTest129 md1=new MyTest129();
        md1.countryName="USA";
        md1.capital="Washington DC";
        md1.populationSize=330000000;
        md1.printInfo();

        MyTest129 md2=new MyTest129();
        md2.countryName="Kazakhstan";
        md2.capital="Astana";
        md2.populationSize=18500000;
        md2.printInfo();


    }
}
