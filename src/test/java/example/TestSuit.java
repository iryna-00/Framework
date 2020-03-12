package example;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObject.ContactUsPage;
import pageObject.HomePage;

@Listeners(listeners.Listener.class)
public class TestSuit extends TestBase {

    @Test(description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit")
    @Parameters({"firstName", "lastName", "email", "phone"})
    public void textCaseExample(String firstName, String lastName, String email, String phone) {
        HomePage homePage = PageFactory.initElements(webDriver, HomePage.class);
        ContactUsPage contactUsPage = homePage.clickContactUsButton();
        contactUsPage.EnterFirstName(firstName);
        contactUsPage.EnterLastName(lastName);
        contactUsPage.EnterEmail(email);
        contactUsPage.EnterPhone(phone);
        contactUsPage.ClickSubmitButton();
        contactUsPage.clickCareersLink(); //java.lang.RuntimeException: java.lang.InstantiationException: pageObject.CareersPage
    }
}
