package homework22;

public class WebDriverInterfaceTest {
    public static void main(String[] args) {

        RemoteWebDriverInterface[] browsers = {new ChromeDriver(), new FirefoxDriver(), new SafariDriver()};
        for (RemoteWebDriverInterface browser:browsers) {
            browser.open();
            browser.close();
            browser.getTitle();
            browser.getScreenshot();
            browser.navigate();
        }
    }
}
