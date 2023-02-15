package homework21;

interface WebDriver {

    void  openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();

}

class ChromeDriver implements WebDriver {

    @Override
    public void openBrowser() {
        System.out.println("Click on Chrome icon to open Chrome Browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Click on X icon to close Chrome Browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Click on maximize icon to maximize Chrome Browser window");
    }

    @Override
    public void findElement() {
        System.out.println("Click Ctrl+F to find a word on a webpage in Chrome Browser");
    }
}

class FirefoxDriver implements WebDriver {

    @Override
    public void openBrowser() {
        System.out.println("Click on Firefox logo to open Firefox Browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Click on X icon on the top right corner to close Firefox Browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Click on maximize icon to maximize Firefox Browser window");
    }

    @Override
    public void findElement() {
        System.out.println("Click Ctrl+F to find a word on a webpage in Firefox Browser");
    }
}
