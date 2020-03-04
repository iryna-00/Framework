package example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.ContactUsPage;

public class TestSuit extends TestBase {

    @Test(description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit")
    public void textCaseExample() {
        ContactUsPage contactUsPage = homePage.clickContactUsButton();
        contactUsPage.pageTitle();
        Assert.assertEquals(webDriver.getTitle(), contactUsPage.pageTitle());

        Actions builder = new Actions(webDriver);
        builder.contextClick(contactUsPage.selector()).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
        Assert.assertTrue(Boolean.parseBoolean(contactUsPage.firstName().getAttribute("required")));
        contactUsPage.firstName().sendKeys("Iryna");
        contactUsPage.lastName().sendKeys("Baranov");
        contactUsPage.email().sendKeys("test@mail.com");
        contactUsPage.phone().sendKeys("4324324234234");

        contactUsPage.submitButton().click();

    }
}
