package tests8;

public class Test132 {

    public static String alphabetical(String s)
    {
        char max=s.charAt(0);
        String result=String.valueOf(s.charAt(0));
        for(int i=1;i<s.length();i++) {
            if(max<s.charAt(i)){
                result+=String.valueOf(s.charAt(i));
                max=s.charAt(i);
            }
        }
        return (String)result;
    }

    public static void main(String[] args) {

        System.out.println(alphabetical("software"));
    }
}
