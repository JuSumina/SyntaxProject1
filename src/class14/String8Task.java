package class14;

public class String8Task {

    public static void main(String[] args) {

        String userName="JuliaSumina";
        String password="Il0veJava!";

        boolean isEmptyUn=userName.isEmpty();
        System.out.println(userName.isEmpty());
        boolean isEmptyPs=password.isEmpty();
        System.out.println(userName.isEmpty());


        int usNaLen=userName.length();
        if (usNaLen<8) {
            System.out.println("Password is too short");
        } else {
            System.out.println("Your password is long enough");
        }

        if (password.contains(userName)) {
            System.out.println("Password cannot contain your user name");
        } else {
            System.out.println("your password does not contain your user name");
        }

        if (!password.equals(password)) {
            System.out.println("Password doesn't match");
        } else {
            System.out.println("You entered a correct password");
        }
    }
}
