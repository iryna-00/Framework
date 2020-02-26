package core;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static core.WebDriverFactory.initialize;

public class BaseTest {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        driver = initialize("chrome");
        driver.get("https://google.com");
        driver = initialize("firefox");
        driver.get("https://google.com");
    }

    @AfterMethod
    public void afterMethod() {
        driver.close();
        driver.quit();
        driver = null;
    }
}
