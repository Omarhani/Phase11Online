package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page500 {

    WebDriver driver;
    public Page500(WebDriver driver) {
        this.driver = driver;
    }
    private final By validationMessage= By.cssSelector("[class='example'] > p");

    public String getValidation(){
        return driver.findElement(validationMessage).getText();
    }
}
