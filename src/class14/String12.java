package class14;

public class String12 {

    public static void main(String[] args) {

        String str="Java is not pain";

        System.out.println(str.indexOf("J"));
        System.out.println(str.indexOf("a"));
        System.out.println(str.indexOf("p"));

        for (int i=0; i<str.length(); i++) {
            System.out.println(str.charAt(i)+" has the index "+i);
        }


    }
}
