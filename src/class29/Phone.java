package class29;

public abstract class Phone {

    abstract void displayPictures ();
    abstract void unlockPhone ();
    abstract void sendText ();
}

class iPhone extends Phone {
    @Override
    void displayPictures() {
        System.out.println("You can see your pictures in Photos");
    }

    @Override
    void unlockPhone() {
        System.out.println("You can unlock your iPhone with Face ID");
    }

    @Override
    void sendText() {
        System.out.println("You can use iMessage to send text messages");
    }
}

class Samsung extends Phone {
    @Override
    void displayPictures() {
        System.out.println("You can see your pictures in Gallery");
    }

    @Override
    void unlockPhone() {
        System.out.println("You can unlock your Samsung with pin");
    }

    @Override
    void sendText() {
        System.out.println("You can use Message to send text message");
    }
}
