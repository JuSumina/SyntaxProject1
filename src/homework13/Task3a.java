package homework13;

public class Task3a {

    void isPalindrome(String str) {

        StringBuilder st=new StringBuilder(str);
        st.reverse();
        String reversedStr=st.toString();
        if(str.equals(reversedStr)) {
            System.out.println(str+" is palindrome");
        } else {
            System.out.println(str + " is not palindrome");
        }

    }

    public static void main(String[] args) {

        Task3a myStr = new Task3a();
        myStr.isPalindrome("level");

    }

    }

