package homework16;

public class Apparel {
    String fabric;
    double price;
    void needFabric(){
        System.out.println("We need fabric to create our new collection of Tops");
    }
}

class Sweatshirts extends Apparel {

    int sleevs;
    int pockets;

    void swAddOns() {
        System.out.println("Sweatshirts must have sleeves, but pockets are optional");
    }
}

class Hoodies extends Sweatshirts {

    boolean hood;

    void hdAddOns () {
        System.out.println("Hoodies must have hoods");
    }
}

