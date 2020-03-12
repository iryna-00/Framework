package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class HomePage extends Page {

    @FindBy(className = "cta-button__text")
    private WebElement contactUsButton;

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public ContactUsPage clickContactUsButton() {
        contactUsButton.click();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return PageFactory.initElements(webDriver, ContactUsPage.class);
    }
}