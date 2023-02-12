package class28;

public class WebDriver {


    public void startBrowser() {
        System.out.println("starting the browser");
    }

    public void openURL() {
        System.out.println("opening a url");
    }

    public void testLoginPage() {
        System.out.println("checking if login page works");
    }

    public void closeBrowser() {
        System.out.println("closing the browser");
    }
}

class Chrome extends WebDriver {
    @Override
    public void startBrowser() {

        System.out.println("Starting Google Chrome");
    }

    @Override
    public void openURL() {

        System.out.println("Opening url in Google Chrome");
    }

    @Override
    public void testLoginPage() {

        System.out.println("Testing the login in Google Chrome");
    }

    @Override
    public void closeBrowser() {

        System.out.println("Closing Google Chrome");
    }
}

class Firefox extends WebDriver {
    @Override
    public void startBrowser() {

        System.out.println("Starting Firefox");
    }

    @Override
    public void openURL() {

        System.out.println("Opening url in Firefox");
    }

    @Override
    public void testLoginPage() {

        System.out.println("Testing the login in Firefox");
    }

    @Override
    public void closeBrowser() {

        System.out.println("Closing Firefox");
    }
}

class Safari extends WebDriver {
    @Override
    public void startBrowser() {

        System.out.println("Starting Safari");
    }

    @Override
    public void openURL() {

        System.out.println("Opening url in Safari");
    }

    @Override
    public void testLoginPage() {

        System.out.println("Testing the login in Safari");
    }

    @Override
    public void closeBrowser() {

        System.out.println("Closing Safari");
    }
}