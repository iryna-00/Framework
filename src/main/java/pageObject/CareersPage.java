package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CareersPage extends Page {

    protected CareersPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(id = "wrapper")
    WebElement someElement;
}
