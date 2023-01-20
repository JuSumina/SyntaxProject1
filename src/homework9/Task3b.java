package homework9;

public class Task3b {

    public static void main(String[] args) {

        String [][] groceryList={ {"cucumbers", "potatoes", "tomatoes"},
                {"bananas", "strawberries", "apples"},
                {"yogurt", "milk", "sour cream"},
                {"eclair", "cheesecake", "donut"},
        };

        for (String [] category: groceryList) {
            for (String item : category) {
                System.out.print(item + " ");
            }
            System.out.println();
        }

    }
}
