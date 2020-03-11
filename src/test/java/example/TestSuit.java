package example;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.CareersPage;
import pageObject.ContactUsPage;
import pageObject.HomePage;

@Listeners(listeners.Listener.class)
public class TestSuit extends TestBase {

    @Test(description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit")
    @Parameters({"firstName", "lastName", "email", "phone"})
    public void textCaseExample(String firstName, String lastName, String email, String phone) {
        ContactUsPage contactUsPage = homePage.clickContactUsButton();
        contactUsPage = PageFactory.initElements(webDriver, ContactUsPage.class);
        contactUsPage.SelectCountry("Talk to Sales in Northern Europe");
        contactUsPage.EnterFirstName(firstName);
        contactUsPage.EnterLastName(lastName);
        contactUsPage.EnterEmail(email);
        contactUsPage.EnterPhone(phone);
        contactUsPage.ClickSubmitButton();

        //contactUsPage.clickCareersLink(); //java.lang.RuntimeException: java.lang.InstantiationException: pageObject.CareersPage



    }
}
