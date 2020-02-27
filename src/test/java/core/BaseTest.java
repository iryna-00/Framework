package core;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.Optional;

import static core.WebDriverFactory.initialize;

public class BaseTest extends DriverManager {
    //WebDriver;


    @BeforeMethod
    public void beforeMethod(ITestContext iTestContext) {
        String browserName =  Optional.ofNullable(Configuration.getBROWSER()).orElse(iTestContext.getCurrentXmlTest().getParameter("browserName"));
        DriverManager.getDriver();
        DriverManager.setDriver(initialize(browserName));
    }

    @AfterMethod
    public void afterMethod() {
        DriverManager.getDriver().quit();

    }
}
