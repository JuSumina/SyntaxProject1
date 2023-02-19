package class33;

public class Array1 {

    public static void main(String[] args) {

        String name1="Julia";
        String name2="Jane";
        String name3="Jessica";

        String [] names={"Julia", "Jane", "Jessica"};

        displayNames(names);
        displayNames2("Julia", "Jane", "Jessica");

    }

    public static void displayNames(String [] names) {

        for (String name:names) {
            System.out.println(name);
        }

    }

    public static void displayNames2(String name1, String name2, String name3) {

        System.out.println(name1+" "+name2+" "+name3);

    }


}
