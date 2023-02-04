package class22;

public class Garden {

    public static void main(String[] args) {

        //flower1 - instance variable
        //new creates an object

        Flower flower1 = new Flower();
        flower1.name="rose";
        flower1.color="pink";
        flower1.price=5;

        flower1.bloom();
        flower1.grow();
        flower1.smell();
        System.out.println(Flower.pretty);



        Flower flower2 = new Flower();
        flower2.name="lily";
        flower2.color="white";
        flower2.price=6;


        Flower flower3 = new Flower();
        flower3.name="tulip";
        flower3.color="pink";
        flower3.price=4;


    }
}
