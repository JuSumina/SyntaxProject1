package class8;

public class LogicalOperators2 {

    public static void main(String[] args) {

        boolean loginButtonDisplayed=true;
        boolean loginButtonClickable=true;

        if (loginButtonClickable && loginButtonDisplayed) {
            System.out.println("The test case is passed");
        } else {
            System.out.println("Test case failed");
        }
    }
}
