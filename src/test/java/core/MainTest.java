package core;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static core.WebDriverFactory.initialize;

public class MainTest extends BaseTest {

    @Test
    public void driverTest() {
        System.out.println(initialize());
        System.out.println(initialize());
        System.out.println(initialize());
        System.out.println(initialize());
        System.out.println(initialize());
    }
}
