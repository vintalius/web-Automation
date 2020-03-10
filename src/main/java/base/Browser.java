package base;

import general.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static general.Constants.URL;

public class Browser {

    private static WebDriver driver;
    private static String url = URL;

    // Return the driver
    public static WebDriver getDriver() {
        return driver;
    }

    // Initiate the driver
    public static WebDriver initiateDriver() {

        System.setProperty(Constants.WEB_DRIVER, Constants.CHROME_DRIVER_LOCATION);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        return driver;

    }

    /**
     * Open url
     *
     * @param url - url destination
     */
    public static void open(String url) {
        driver.get(url);
    }

    // Close driver
    public static void close() {
        driver.close();
    }

    // Quit driver
    public static void quit() {
        driver.quit();
    }

}
