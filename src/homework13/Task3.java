package homework13;

public class Task3 {

    boolean palindromeStr (String myStr) {

        String reverseStr = new StringBuilder(myStr).reverse().toString();
        if (myStr.equals(reverseStr)) {
            return true;
        } else {
            return false;
        }
    }


}
