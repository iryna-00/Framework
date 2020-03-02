package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Page {

    @FindBy(className = "button__content button__content--desktop")
    private WebElement contactUsButton;

    public HomePage(WebDriver webDriver) {
        super(webDriver);
        // TODO Auto-generated constructor stub
    }

    public ContactUsPage clickContactUsButton() {
        contactUsButton.click();
        return PageFactory.initElements(webDriver, ContactUsPage.class);
    }
}