package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class ContactUsPage extends Page {
    public ContactUsPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(how = How.ID, using = "_content_epam_en_about_who-we-are_contact_jcr_content_content-container_section_section-par_form_constructor_user_first_name")
    private WebElement firstNameField;
    public void EnterFirstName(String firstName) {
        firstNameField.sendKeys(firstName);
    }

    @FindBy(how = How.ID, using = "_content_epam_en_about_who-we-are_contact_jcr_content_content-container_section_section-par_form_constructor_user_last_name")
    private WebElement lastNameField;
    public void EnterLastName(String lastName) {
        lastNameField.sendKeys(lastName);
    }

    @FindBy(how = How.ID, using = "_content_epam_en_about_who-we-are_contact_jcr_content_content-container_section_section-par_form_constructor_user_email")
    private WebElement emailField;
    public void EnterEmail(String email) {
        emailField.sendKeys(email);
    }

    @FindBy(how = How.ID, using = "_content_epam_en_about_who-we-are_contact_jcr_content_content-container_section_section-par_form_constructor_user_phone")
    private WebElement phoneField;
    public void EnterPhone(String phone) {
        phoneField.sendKeys(phone);
    }

    @FindBy(how = How.CLASS_NAME, using = "button-ui")
    private WebElement submitButton;
    public void ClickSubmitButton() {
        submitButton.click();
    }

    @FindBy(how = How.XPATH, using = "//a[@class='top-navigation__item-link'][contains(text(),'Careers')]")
    private WebElement careersLink;
    public CareersPage clickCareersLink(){
        careersLink.click();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return PageFactory.initElements(webDriver, CareersPage.class);
    }
}
