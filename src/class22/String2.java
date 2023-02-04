package class22;

public class String2 {

    public static void main(String[] args) {

        String myString="Today is February 2nd";
        String [] strArray=myString.split(" ");
        for (String arrayPart:strArray) {
            System.out.println(arrayPart);
        }
    }
}
