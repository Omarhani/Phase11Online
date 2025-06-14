package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JSAlertPage {

    WebDriver driver;

    public JSAlertPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By jsAlertButton = By.xpath("//button[contains(text(),'JS Alert')]");

    private final By validation = By.id("result");

    public void clickOnJsAlertButton(){
        driver.findElement(jsAlertButton).click();
    }

    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }

    public String getValidation(){
        return driver.findElement(validation).getText();
    }
}
