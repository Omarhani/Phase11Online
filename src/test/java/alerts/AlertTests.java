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

    @Test
    public void testJSDismissAlert(){
        JSAlertPage jsAlertPage = homePage.clickOnJsAlertLink();
        jsAlertPage.clickOnJsConfirmButton();
        jsAlertPage.dismissAlert();
        String expectedResult = "You clicked: Cancel";
        String actualResult = jsAlertPage.getValidation();
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testJSSendKeysAlert(){
        JSAlertPage jsAlertPage = homePage.clickOnJsAlertLink();
        jsAlertPage.clickOnJsPromptButton();
        jsAlertPage.sendKeysAlert("Hello");
        jsAlertPage.acceptAlert();
        String expectedResult = "You entered: Hello";
        String actualResult = jsAlertPage.getValidation();
        assertEquals(actualResult, expectedResult);
    }
}
