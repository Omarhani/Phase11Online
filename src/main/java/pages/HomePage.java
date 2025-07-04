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

    private final By jsAlertLink = By.linkText("JavaScript Alerts");

    private final By hoverLink = By.linkText("Hovers");

    private final By dragAndDropLink = By.linkText("Drag and Drop");

    // actions

    public LoginPage clickOnFormAuthenticationLink(){
        clickOnLink(formAuthenticationLink);
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

    public HoverPage clickOnHoverLink(){
        clickOnLink(hoverLink);
        return new HoverPage(driver);
    }
    public DragAndDropPage clickOnDragAndDropLink(){
        clickOnLink(dragAndDropLink);
        return new DragAndDropPage(driver);
    }
    private void clickOnLink(By locator){
        driver.findElement(locator).click();
    }


}
