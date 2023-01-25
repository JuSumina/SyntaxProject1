package class15;

public class String3 {

    public static void main(String[] args) {

        String str="I like Java. I write a lot of code daily. I am from Batch 15.";
        String [] strArr=str.split("[.?!]");
        System.out.println(strArr.length);
        System.out.println(strArr[0].trim());


    }
}
