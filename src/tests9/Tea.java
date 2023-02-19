package tests9;

public abstract class Tea {

    String teaType;

    Tea (String teaType) {
        this.teaType=teaType;
    }

    abstract void addSugar();

    public static void main(String[] args) {

        LemonTea lemonTea=new LemonTea("lemon tea");
        lemonTea.addSugar();

        ChaiTea chaiTea=new ChaiTea("chai tea");
        chaiTea.addSugar();

    }



}

class LemonTea extends Tea {

    public LemonTea(String teaType) {
        super(teaType);
    }

    @Override
    void addSugar() {

        System.out.println("For Lemon Tea we need 2 spoons of sugar");

    }
}

class ChaiTea extends Tea {

    public ChaiTea(String teaType) {
        super(teaType);
    }

    @Override
    void addSugar() {

        System.out.println("For Chai Tea we need 1 spoon of sugar");

    }
}
