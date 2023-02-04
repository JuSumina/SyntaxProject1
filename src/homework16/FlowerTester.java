package homework16;

public class FlowerTester {

    public static void main(String[] args) {

        Flower flower1=new Flower();
        flower1.type="tulip";
        flower1.color="white";
        flower1.printF();

        Rose rose1=new Rose();
        rose1.type="tea rose";
        rose1.color="pink";
        rose1.prickles=true;
        rose1.printF();
        rose1.scratch();


    }

}
