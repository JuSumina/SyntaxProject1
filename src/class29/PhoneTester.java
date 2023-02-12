package class29;

public class PhoneTester {

    public static void main(String[] args) {

        Phone [] phones = {new iPhone(), new Samsung()};
        for (Phone p:phones) {
            p.unlockPhone();
            p.sendText();
            p.displayPictures();

        }
    }
}
