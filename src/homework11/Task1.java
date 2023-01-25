package homework11;

public class Task1 {

    public static void main(String[] args) {

        String str= "The future is bright!";

        if (!str.isEmpty()) {
            if ((str.length()) % 2!=0 && str.length()>3) {
                int middleEven=(str.length()-1)/2;
                int middle=middleEven+1;
                System.out.println(str.charAt(middle));
            }
        }
    }
}
