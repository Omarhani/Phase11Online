package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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

    // actions

    public LoginPage clickOnFormAuthenticationLink(){
        driver.findElement(formAuthenticationLink).click();
        return new LoginPage(driver);
    }

    public CheckBoxPage clickOnCheckBoxLink(){
        driver.findElement(checkBoxLink).click();
        return new CheckBoxPage(driver);
    }

    public ForgetPasswordPage clickOnForgetPasswordLink(){
        driver.findElement(forgetPasswordLink).click();
        return new ForgetPasswordPage(driver);
    }

    public StatusCodePage clickOnStatusCodeLink(){
        driver.findElement(statusCodeLink).click();
        return new StatusCodePage(driver);
    }

    public DynamicLoadingPage clickOnDynamicLoadingLink(){
        driver.findElement(dynamicLoadingLink).click();
        return new DynamicLoadingPage(driver);
    }

    public DropDownPage clickOnDropDownLink(){
        driver.findElement(dropDownLink).click();
        return new DropDownPage(driver);
    }


}
