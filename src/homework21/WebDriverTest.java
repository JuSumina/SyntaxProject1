package homework21;

public class WebDriverTest {

    public static void main(String[] args) {

        WebDriver [] webDrivers = {new ChromeDriver(), new FirefoxDriver()};

        for (WebDriver w: webDrivers) {
            w.openBrowser();
            w.closeBrowser();
            w.maximizeWindow();
            w.findElement();
        }
    }
}
