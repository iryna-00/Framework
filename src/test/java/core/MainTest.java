package core;

import org.testng.annotations.Test;

import static core.WebDriverFactory.initialize;

public class MainTest extends BaseTest {

    @Test
    public void driverTest() {
        System.out.println(initialize("firefox"));
        System.out.println(initialize("chrome"));
        System.out.println(initialize("chrome"));
        System.out.println(initialize("firefox"));
        System.out.println(initialize("firefox"));
    }
}
