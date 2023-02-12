package tests8;

public class Test126 {

    static String surround (String s, char search_term) {

        StringBuilder surS = new StringBuilder();
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i)==search_term) {
                surS.append("("+s.charAt(i)+")");
            } else {
                surS.append(s.charAt(i));
            }

        }
        return surS.toString();
    }

    public static void main(String[] args) {


    }
}
