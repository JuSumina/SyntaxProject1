package tests8;

public class Test127 {

    private void privatetMd () {
        System.out.println("This is Private Method");
    }

    void defaultMd () {
        System.out.println("This is Default Method");
    }

    protected void protectedMd () {
        System.out.println("This is Protected Method");
    }

    public void publicMd () {
        System.out.println("This is Public Method");
    }



    public static void main(String[] args) {

        Test127 md = new Test127();
        md.privatetMd();
        md.defaultMd();
        md.protectedMd();
        md.publicMd();

    }
}
