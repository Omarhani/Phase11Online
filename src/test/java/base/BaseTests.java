package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

import java.time.Duration;

public class BaseTests {

    protected WebDriver driver;

    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
        driver = new EdgeDriver();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
    }


    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");

    }

    @AfterClass
    public void tearDown(){
        driver.quit();

    }

}
