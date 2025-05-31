package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgetPasswordPage {

    WebDriver driver;

    public ForgetPasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By emailField = By.id("email");

    private final By retrievePassword = By.id("form_submit");
    private final By validation = By.xpath("//h1");

    public void insertEmail(String email){
        driver.findElement(emailField).sendKeys(email);
    }
    public void clickOnRetrievePassword(){
        driver.findElement(retrievePassword).click();
    }
    public String getValidation(){
        return driver.findElement(validation).getText();
    }

}
