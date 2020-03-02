package example;

import consts.Constants;
import driver.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import pageObject.HomePage;

import java.util.concurrent.TimeUnit;


public class TestBase {

	protected WebDriver webDriver;
	protected HomePage homePage;

	@Parameters({"browserName"})
	@BeforeMethod(alwaysRun = true)
	public void setup(String browserName) {
		WebDriverFactory.initDriver(browserName);
		webDriver = WebDriverFactory.getDriver();
		webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		navigateTo(Constants.Application.BASE_URL);
		homePage = PageFactory.initElements(webDriver, HomePage.class);
	}

	protected  void navigateTo(String URL){
		webDriver.get(URL);
	}


	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		WebDriverFactory.quitDriver();
	}

}
