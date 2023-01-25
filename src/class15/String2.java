package class15;

public class String2 {

    public static void main(String[] args) {

        String str=" fbsehi8293KLM20-odRRsfRThhua90))%2";
        System.out.println(str.replaceAll("[A-Z]","#"));
        System.out.println(str.replaceAll("[a-z]","!"));
        System.out.println(str.replaceAll("[^A-Za-z0-9]","x"));

        //don't specify anything to remove A-Za-z0-9
        System.out.println(str.replaceAll("[A-Za-z0-9]",""));
    }
}
