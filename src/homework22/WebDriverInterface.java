package homework22;

public interface WebDriverInterface {

    void open();
    void close();
    String getTitle();

}

interface TakesScreenshot {
    void getScreenshot();
}

interface RemoteWebDriverInterface extends TakesScreenshot, WebDriverInterface{
    void navigate();

}

class ChromeDriver implements RemoteWebDriverInterface {

    @Override
    public void open() {
        System.out.println("Chrome browser opens");
    }

    @Override
    public void close() {
        System.out.println("Chrome browser closes");
    }

    @Override
    public String getTitle() {
        return "Chrome";
    }

    @Override
    public void getScreenshot() {
        System.out.println("Chrome browser takes screenshot");
    }

    @Override
    public void navigate() {

        System.out.println("You can navigate in Chrome browser using remote control desktop application");

    }
}

class FirefoxDriver implements RemoteWebDriverInterface {

    @Override
    public void open() {
        System.out.println("Firefox browser opens");
    }

    @Override
    public void close() {
        System.out.println("Firefox browser closes");
    }

    @Override
    public String getTitle() {
        return "Firefox";
    }

    @Override
    public void getScreenshot() {
        System.out.println("Firefox browser takes screenshot");
    }

    @Override
    public void navigate() {

        System.out.println("You can navigate in Firefox browser using remote control desktop application");

    }
}

class SafariDriver implements RemoteWebDriverInterface {

    @Override
    public void open() {
        System.out.println("Safari browser opens");
    }

    @Override
    public void close() {
        System.out.println("Safari browser closes");
    }

    @Override
    public String getTitle() {
        return "Safari";
    }

    @Override
    public void getScreenshot() {
        System.out.println("Safari browser takes screenshot");
    }

    @Override
    public void navigate() {

        System.out.println("You can navigate in Safari browser using remote control desktop application");

    }
}