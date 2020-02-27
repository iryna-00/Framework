package core;

import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Optional;

import static core.WebDriverFactory.initialize;

public class BaseTest extends DriverManager {

    @BeforeMethod
    public void beforeMethod(ITestContext iTestContext) throws InterruptedException {
        String URL = Configuration.getURL();
        String browserName =  Optional.ofNullable(Configuration.getBROWSER()).orElse(iTestContext.getCurrentXmlTest().getParameter("browserName"));
        DriverManager.setDriver(initialize(browserName));
        DriverManager.getDriver().get(URL);
        Thread.sleep(2000);
    }

    @AfterMethod
    public void afterMethod() {
        DriverManager.getDriver().quit();

    }
}
