package core;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static core.WebDriverFactory.initialize;

public class BaseTest {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod(ITestContext iTestContext) {
        String browserName =  iTestContext.getCurrentXmlTest().getParameter("browserName");
        driver = initialize(browserName);
        driver.get("https://google.com");
    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
        driver = null;
    }
}
