package class18;

public class Method3 {

    String reverseStr(String str) {
        String newStr="";
        for (int i=str.length()-1; i>=0; i--) {
            newStr+=str.charAt(i);
        }
        return newStr;
    }


}
