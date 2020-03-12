package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class ContactUsPage extends Page {
    public ContactUsPage(WebDriver webDriver) {
        super(webDriver);
    }

    //@FindBy(how = How.XPATH, using = "//a[@class='top-navigation__item-link'][contains(text(),'Careers')]")
    //private WebElement careersLink;
    //private String pageTitle;


    @FindBy(how = How.XPATH, using = "//*[@id=select2-_content_epam_en_about_who-we-are_contact_jcr_content_content-container_section_section-par_form_constructor_mail_subjects-results]")
    private WebElement selector;
    public  WebElement selector(){
        return webDriver.findElement(By.className("select2-selection__rendered"));
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





/*verify page title
    public String pageTitle(){
        return webDriver.getTitle();
    }
    contactUsPage.pageTitle();
        Assert.assertEquals(webDriver.getTitle(), contactUsPage.pageTitle());
 */
/*Asserts level
        Assert.assertTrue(Boolean.parseBoolean(contactUsPage.firstName().getAttribute("aria-required")));
        Assert.assertTrue(Boolean.parseBoolean(contactUsPage.lastName().getAttribute("aria-required")));
        Assert.assertTrue(Boolean.parseBoolean(contactUsPage.email().getAttribute("aria-required")));
        Assert.assertTrue(Boolean.parseBoolean(contactUsPage.phone().getAttribute("aria-required")));
 */

    /*public CareersPage clickCareersLink() {
        careersLink.click();
        return PageFactory.initElements(webDriver, CareersPage.class);
    }

     */
}
