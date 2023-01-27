package class16;

public class HwTask3 {

    public static void main(String[] args) {

        String str="Is it saturday? Is it raining? Do we have a Java Class today?";
        /*String [] arr=str.split(" ");
        System.out.println(arr.length);
        System.out.println(arr[2]);*/

        System.out.println(str.split("[?]").length);

    }
}
