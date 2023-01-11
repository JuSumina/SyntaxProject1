package class5;

import com.sun.security.jgss.GSSUtil;

public class LogicalOperators2 {

    public static void main(String[] args) {

        boolean broughtCho=true;
        boolean boughtFlowers=true;
        if(broughtCho||boughtFlowers) {
            System.out.println("I am happy");
        } else {
            System.out.println("I am not");
        }

        boolean wifi=true;
        boolean fiveG=true;

        if (wifi||fiveG) {
            System.out.println("You are good for browsing the interner");
        } else {
            System.out.println("Either connect to wifi or to 5G");
        }

    }
}
