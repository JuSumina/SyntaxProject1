package review2;

public class IfElseIf2 {

    public static void main(String[] args) {

        String browser = "Opera";

        if (browser.equals("Chrome")) {

            System.out.println("Test cases executed on Chrome browser");

        } else if (browser.equals("Safari")) {
            System.out.println("Test cases executed on Safari browser");

        } else if (browser.equals("Firefox")) {
            System.out.println("Test cases executed on Firefox browser");

        } else {
            System.out.println("The browser is not supported");
        }
    }
}
