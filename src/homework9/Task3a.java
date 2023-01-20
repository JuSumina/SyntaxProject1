package homework9;

public class Task3a {

    public static void main(String[] args) {

        String [][] groceryList={ {"cucumbers", "potatoes", "tomatoes"},
                {"bananas", "strawberries", "apples"},
                {"yogurt", "milk", "sour cream"},
                {"eclair", "cheesecake", "donut"},
        };

        for (int i=0; i<groceryList.length; i++) {
            for (int j=0; j<groceryList[i].length; j++)
            System.out.print(groceryList[i][j]+" ");
            System.out.println();
        }
    }
}
