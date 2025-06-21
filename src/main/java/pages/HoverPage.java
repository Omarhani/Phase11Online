package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.FigureCaption;

public class HoverPage {

    WebDriver driver;
    Actions actions;

    public HoverPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By figure = By.cssSelector(".figure");

    private final By figureCaption = By.cssSelector(".figcaption");

    public FigureCaption hoverOverFigure(int index){
        actions = new Actions(driver);
        WebElement element = driver.findElements(figure).get(index-1);
        actions.moveToElement(element).perform();
        return new FigureCaption(element.findElement(figureCaption));
    }
}
