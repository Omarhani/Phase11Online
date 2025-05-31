package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StatusCodePage {

    WebDriver driver;

    public StatusCodePage(WebDriver driver) {
        this.driver = driver;
    }

    private final By code200 = By.linkText("200");
    private final By code301 = By.linkText("301");
    private final By code404 = By.linkText("404");
    private final By code500 = By.linkText("500");

    public Page200 clickCode200(){
        driver.findElement(code200).click();
        return new Page200(driver);
    }
    public Page301 clickCode301(){
        driver.findElement(code301).click();
        return new Page301(driver);
    }
    public Page404 clickCode404(){
        driver.findElement(code404).click();
        return new Page404(driver);
    }
    public Page500 clickCode500(){
        driver.findElement(code500).click();
        return new Page500(driver);
    }
}
