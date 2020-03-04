package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactUsPage extends Page {
    private String pageTitle;
    private WebElement selector;
    private WebElement firstName;
    private WebElement lastName;
    private WebElement email;
    private WebElement phone;
    private WebElement submitButton;

    public ContactUsPage(WebDriver webDriver) {
        super(webDriver);
    }

    public String pageTitle(){
        return webDriver.getTitle();
    }

    public  WebElement selector(){
        return webDriver.findElement(By.className("select2-selection__rendered"));
    }

    public  WebElement firstName(){
        return webDriver.findElement(By.id("_content_epam_en_about_who-we-are_contact_jcr_content_content-container_section_section-par_form_constructor_user_first_name"));
    }

    public  WebElement lastName(){
        return webDriver.findElement(By.id("_content_epam_en_about_who-we-are_contact_jcr_content_content-container_section_section-par_form_constructor_user_last_name"));
    }

    public  WebElement email(){
        return webDriver.findElement(By.id("_content_epam_en_about_who-we-are_contact_jcr_content_content-container_section_section-par_form_constructor_user_email"));
    }

    public  WebElement phone(){
        return webDriver.findElement(By.id("_content_epam_en_about_who-we-are_contact_jcr_content_content-container_section_section-par_form_constructor_user_phone"));
    }

    public  WebElement submitButton(){
        return webDriver.findElement(By.className("button-ui"));
    }


}
