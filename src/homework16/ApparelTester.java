package homework16;

public class ApparelTester {

    public static void main(String[] args) {

        Apparel ap=new Apparel();
        ap.fabric="cotton";
        ap.price=49.99;
        ap.needFabric();

        System.out.println(ap.fabric);
        System.out.println(ap.price);

        Sweatshirts sw= new Sweatshirts();
        sw.fabric="blend of cotton and polyester";
        sw.price=99.99;
        sw.sleevs=2;
        sw.pockets=0;
        sw.needFabric();
        sw.swAddOns();

        System.out.println(sw.sleevs);
        System.out.println(sw.pockets);

        Hoodies hd=new Hoodies();
        hd.fabric="fleece";
        hd.price=109.99;
        hd.sleevs=2;
        hd.pockets=2;
        hd.hood=true;
        hd.needFabric();
        hd.swAddOns();
        hd.hdAddOns();

        System.out.println(hd.hood);







    }
}
