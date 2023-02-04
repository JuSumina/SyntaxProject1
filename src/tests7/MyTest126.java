package tests7;

public class MyTest126 {

    String censorLetter (String myS, char myC) {
        return myS.replace(myC,'*');
    }

    public static void main(String[] args) {

        MyTest126 md = new MyTest126();
        System.out.println(md.censorLetter("love", 'e'));
    }
}
