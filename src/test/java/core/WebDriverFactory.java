package core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {
    private static WebDriver driver = null;

    public static WebDriver initialize(String browserName) {
        if (driver == null) {
            if ("chrome".equalsIgnoreCase(browserName)) {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            }
            else if ("firefox".equalsIgnoreCase(browserName)){
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            }
        }
        return driver;
    }
}