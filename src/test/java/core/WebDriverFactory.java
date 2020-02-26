package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverFactory {
    private static WebDriver driver = null;
    private static String projectPath = System.getProperty("user.dir");

    public static WebDriver initialize() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/java/drivers/chromedriver.exe");
            driver = new ChromeDriver();
        }
        return driver;
    }
}