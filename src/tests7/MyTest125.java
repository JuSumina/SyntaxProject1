package tests7;

public class MyTest125 {


    String spaceOut( String s) {

        String newS="";

        for (int i=0; i<s.length(); i++) {

            System.out.print(s.charAt(i)+" ");
        }

        return newS;

    }

    public static void main(String[] args) {

        MyTest125 md = new MyTest125();
        System.out.print(md.spaceOut("hello"));


    }
}
