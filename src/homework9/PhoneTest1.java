package homework9;

public class PhoneTest1 {

    public static void main(String[] args) {

        Phone phone1 = new Phone();

        phone1.brand = "iPhone";
        phone1.model = "12 Pro";
        phone1.color = "Space Grey";
        phone1.softwareVersion = 16.2;
        phone1.softwareUpdate = true;

        System.out.println("I want to unlock my phone iPhone");
        phone1.passcode();

        Phone phone2 = new Phone();

        phone2.brand = "Pixel";
        phone2.model = "7 Pro";
        phone2.color = "Obsidian";
        phone2.softwareVersion = 10.0;
        phone2.softwareUpdate = false;

        System.out.println("I want to upload photos from my camera roll to Instagram");
        phone2.accessPhotos();

        Phone phone3 = new Phone();

        phone3.brand = "Samsung";
        phone3.model = "S22 Ultra";
        phone3.color = "Phantom Black";
        phone3.softwareVersion = 12.0;
        phone3.softwareUpdate = true;

        System.out.println("Would you like this app to track?");
        phone3.tracking();

    }
}
