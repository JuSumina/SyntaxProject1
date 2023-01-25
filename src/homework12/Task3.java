package homework12;

public class Task3 {

    public static void main(String[] args) {

        String a="Is it saturday? Is it raining? Do we have a Java Class today?";
        String [] strArr=a.split("[.?!]");
        System.out.println(strArr.length);
    }
}
