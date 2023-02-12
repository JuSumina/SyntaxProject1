package class28;

public class WebDriveTester {

    public static void main(String[] args) {

        //WebDriver webDriver=new Chrome();

        /*webDriver.startBrowser();
        webDriver.openURL();
        webDriver.testLoginPage();
        webDriver.closeBrowser();*/

        WebDriver [] browsers = {new Chrome(), new Safari(), new Firefox()};
        for (WebDriver browser: browsers) {
            browser.startBrowser();
            browser.openURL();
            browser.testLoginPage();
            browser.closeBrowser();
        }



        /*Firefox firefox=new Firefox();
        firefox.startBrowser();
        firefox.openURL();
        firefox.testLoginPage();
        firefox.closeBrowser();

        Safari safari=new Safari();
        safari.startBrowser();
        safari.openURL();
        safari.testLoginPage();
        safari.closeBrowser();*/
    }
}
