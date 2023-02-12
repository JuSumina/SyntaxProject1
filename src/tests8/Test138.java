package tests8;

public class Test138 {

    String dogName;
    double dogWeight;
    static String dogBreed="Mutt";

    Test138 (String dogName, double dogWeight) {
        this.dogName=dogName;
        this.dogWeight=dogWeight;

    }

    void printInfo () {
        System.out.println(dogName+" "+dogBreed+" "+dogWeight);
    }

    public static void main(String[] args) {
        Test138 dog1=new Test138("Tarzan", 50);
        dog1.printInfo();

        Test138 dog2=new Test138("Lucy", 10);
        dog2.printInfo();


    }
}
