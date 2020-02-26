package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverFactory {
    private static WebDriver driver = null;
    private static String projectPath = System.getProperty("user.dir");

    private static void initialize() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/java/drivers/chromedriver.exe");
            driver = new ChromeDriver();
        }
    }

    public static void main(String[] args) {
        initialize();
        driver.get("https://google.com");
        driver.close();
        driver.quit();
        driver = null;
    }
}