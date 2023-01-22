package class14;

public class StoreTester {
    public static void main(String[] args) {

        Store target= new Store();

        String name="Target";
        String location="Brooklyn";
        int yearEstablished=1902;
        boolean onlineStore=true;

        target.shopInStore();
        target.shopOnline();

    }


}
