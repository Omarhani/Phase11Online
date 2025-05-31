package statusCode;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.*;

import static org.testng.Assert.assertTrue;

public class StatusCodeTests extends BaseTests {

    @Test
    public void testCode200(){
        StatusCodePage statusCodePage = homePage.clickOnStatusCodeLink();
        Page200 page200 = statusCodePage.clickCode200();
        assertTrue(page200.getValidation().contains("200"));
    }
    @Test
    public void testCode301(){
        StatusCodePage statusCodePage = homePage.clickOnStatusCodeLink();
        Page301 page301 = statusCodePage.clickCode301();
        assertTrue(page301.getValidation().contains("301"));
    }
    @Test
    public void testCode404(){
        StatusCodePage statusCodePage = homePage.clickOnStatusCodeLink();
        Page404 page404 = statusCodePage.clickCode404();
        assertTrue(page404.getValidation().contains("404"));
    }

    @Test
    public void testCode500(){
        StatusCodePage statusCodePage = homePage.clickOnStatusCodeLink();
        Page500 page500 = statusCodePage.clickCode500();
        assertTrue(page500.getValidation().contains("500"));
    }
}
