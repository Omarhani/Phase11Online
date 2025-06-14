package alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.JSAlertPage;

import static org.testng.Assert.assertEquals;

public class AlertTests extends BaseTests {

    @Test
    public void testJSAcceptAlert() {
        JSAlertPage jsAlertPage = homePage.clickOnJsAlertLink();
        jsAlertPage.clickOnJsAlertButton();
        jsAlertPage.acceptAlert();
        String expectedResult = "You successfully clicked an alert";
        String actualResult = jsAlertPage.getValidation();
        assertEquals(actualResult, expectedResult);
    }
}
