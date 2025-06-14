package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    // locators
    private final By formAuthenticationLink = By.partialLinkText("Form ");

    private final By checkBoxLink = By.linkText("Checkboxes");

    private final By forgetPasswordLink = By.linkText("Forgot Password");

    private final By statusCodeLink = By.linkText("Status Codes");
    private final By dynamicLoadingLink = By.linkText("Dynamic Loading");
    private final By dropDownLink = By.linkText("Dropdown");

    private final By jsAlertLink = By.linkText("JavaScript Alerts");

    // actions

    public LoginPage clickOnFormAuthenticationLink(){
        clickOnLink(forgetPasswordLink);
        return new LoginPage(driver);
    }

    public CheckBoxPage clickOnCheckBoxLink(){
        clickOnLink(checkBoxLink);
        return new CheckBoxPage(driver);
    }

    public ForgetPasswordPage clickOnForgetPasswordLink(){
        clickOnLink(forgetPasswordLink);
        return new ForgetPasswordPage(driver);
    }

    public StatusCodePage clickOnStatusCodeLink(){
        clickOnLink(statusCodeLink);
        return new StatusCodePage(driver);
    }

    public DynamicLoadingPage clickOnDynamicLoadingLink(){
        clickOnLink(dynamicLoadingLink);
        return new DynamicLoadingPage(driver);
    }

    public DropDownPage clickOnDropDownLink(){
        clickOnLink(dropDownLink);
        return new DropDownPage(driver);
    }

    public JSAlertPage clickOnJsAlertLink(){
        clickOnLink(jsAlertLink);
        return new JSAlertPage(driver);
    }
    private void clickOnLink(By locator){
        driver.findElement(locator).click();
    }


}
