package homework15;

public class Food {

    String type;
    String name;
    String color;
    double weight;

    Food(String foodType, String foodName, String foodColor, double foodWeight) {
        type=foodType;
        name=foodName;
        color=foodColor;
        weight=foodWeight;

        //Constructor cannot be static
    }

    void foodInfo() {
        System.out.println(type+name+color+weight);
    }


    public static void main(String[] args) {

        Food fruit=new Food("fruit", "banana", "yellow", 1);
        fruit.foodInfo();

    }
}
