package example;

import consts.Constants;
import driver.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import pageObject.CareersPage;
import pageObject.ContactUsPage;
import pageObject.HomePage;


public class TestBase {

	protected WebDriver webDriver;
	protected HomePage homePage;
	protected ContactUsPage contactUsPage;
	protected CareersPage careersPage;

	@Parameters({"browserName"})
	@BeforeMethod(alwaysRun = true)
	public void setup(String browserName) {
		WebDriverFactory.initDriver(browserName);
		webDriver = WebDriverFactory.getDriver();
		navigateTo(Constants.Application.BASE_URL);
		WebDriverWait wait = new WebDriverWait(webDriver, 20);
		WebElement button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("cta-button__text")));
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
