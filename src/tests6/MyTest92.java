package tests6;


import java.util.ArrayList;

public class MyTest92 {

    public static void main(String[] args) {

        ArrayList<String> bakeryList = new ArrayList();

        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();


        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");

        ArrayList<String> produceList = new ArrayList();

        produceList.add("tomatoes");
        produceList.add("potatoes");
        produceList.add("peppers");

        ArrayList<String> drinkList = new ArrayList();

        drinkList.add("coffee");
        drinkList.add("tea");

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinkList);

        System.out.println(groceryList.get(0).get(0));




    }
}
