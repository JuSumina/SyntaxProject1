package tests8;

public class Test130 {

    private static String privateS() {
        return "private";
    }

    static String defaultS() {
        return "default";
    }

    protected static String protectedS() {
        return "protected";
    }

    public static String publicS() {
        return "public";
    }

}

class Main {

    public static void main(String[] args) {

        //System.out.println(Test130.privateS());

        System.out.println(Test130.defaultS());

        System.out.println(Test130.protectedS());

        System.out.println(Test130.publicS());


    }
}
