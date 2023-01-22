package class14;

public class String1 {

    public static void main(String[] args) {

        String strObj1=new String("Java");
        String strObj2="Java";

        System.out.println(strObj2.length());

        String strObj3="Banana ";
        int len=strObj3.length();
        System.out.println(len);

        String name="Julia";
        if(name.length()>10){
            System.out.println("Name can't be more than 10 letters");
        }


    }
}
