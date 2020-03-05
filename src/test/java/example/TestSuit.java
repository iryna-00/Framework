package example;

import org.testng.annotations.Parameters;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.CareersPage;
import pageObject.ContactUsPage;

public class TestSuit extends TestBase {

    @Test(description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit")
    @Parameters({"firstName", "lastName", "email", "phone"})
    public void textCaseExample(String firstName, String lastName, String email, String phone) {
        ContactUsPage contactUsPage = homePage.clickContactUsButton();
        contactUsPage.pageTitle();
        Assert.assertEquals(webDriver.getTitle(), contactUsPage.pageTitle());
        Actions builder = new Actions(webDriver);
        builder.contextClick(contactUsPage.selector()).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
        Assert.assertTrue(Boolean.parseBoolean(contactUsPage.firstName().getAttribute("aria-required")));
        Assert.assertTrue(Boolean.parseBoolean(contactUsPage.lastName().getAttribute("aria-required")));
        Assert.assertTrue(Boolean.parseBoolean(contactUsPage.email().getAttribute("aria-required")));
        Assert.assertTrue(Boolean.parseBoolean(contactUsPage.phone().getAttribute("aria-required")));
        contactUsPage.firstName().sendKeys(firstName);
        contactUsPage.lastName().sendKeys(lastName);
        contactUsPage.email().sendKeys(email);
        contactUsPage.phone().sendKeys(phone);
        contactUsPage.submitButton().click();
        CareersPage careersPage = contactUsPage.clickCareersLink();



    }
}
