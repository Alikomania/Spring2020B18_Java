package day47_Abstraction;

public class driverObjects {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.quit();

        FirefoxDriver driver2 = new FirefoxDriver();
        driver2.get("https://www.firefox.com");
        driver2.quit();

        OperaDriver driver3 = new OperaDriver();
        driver3.get("https://www.opera.com");
        driver3.quit();

        EdgeDriver driver4 = new EdgeDriver();
        driver4.get("https://www.edge.com");
        driver4.quit();

        SafariDriver driver5 = new SafariDriver();
        driver5.get("https://www.safari.com");
        driver5.quit();

        IEDriver driver6 = new IEDriver();
        driver6.get("https://www.explorer.com");
        driver6.quit();
    }
}
