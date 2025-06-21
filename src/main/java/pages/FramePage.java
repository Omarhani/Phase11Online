package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramePage {

    WebDriver driver;

    public FramePage(WebDriver driver) {
        this.driver = driver;
    }

    String frame = "singleframe";

    private final By inputField = By.xpath("//input[@type='text']");

    private void switchToFrame(){
        driver.switchTo().frame(frame);
    }

    public void insertText(String text){
        switchToFrame();
        driver.findElement(inputField).sendKeys(text);
        switchToParent();
    }

    private void switchToParent(){
        driver.switchTo().parentFrame();
    }
}
