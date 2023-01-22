package homework9;

public class Phone {


    String brand;

    String model;

    String color;

    double softwareVersion;

    boolean softwareUpdate;

    void passcode() {
        System.out.println("Please enter your passcode");
    }

    void accessPhotos () {
        System.out.println("Allow App to access your photos");
    }

    void tracking() {System.out.println("Ask App not to tracking");}
}
