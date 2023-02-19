package class33;

public class Array2 {

    public static void main(String[] args) {

        String name="John";
        String [] names={"Julia", "Jane", "Jessica"};

        for (int i=0; i<names.length; i++ ) {
            if (names[i].equals("John")) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }

        hasName(name, names);

    }

    public static boolean hasName(String name, String[] names) {
        for (String n : names) {
            if (name.equals(name)) {
                return true;
            }
        }
        return false;
    }

}
