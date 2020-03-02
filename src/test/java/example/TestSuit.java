package example;

import org.testng.annotations.Test;
import pageObject.ContactUsPage;

public class TestSuit extends TestBase {

    @Test(description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit")
    public void textCaseExample() {
        ContactUsPage contactUsPage = homePage.clickContactUsButton();
//        contactUsPage.verifySomething();  assertion layer should be added
    }
}
