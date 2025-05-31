package forget;

import base.BaseTests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.ForgetPasswordPage;

import static org.testng.Assert.assertEquals;

public class ForgetPasswordTests extends BaseTests {

    @Test
    public void testForgetPassword() {
        ForgetPasswordPage forgetPasswordPage = homePage.clickOnForgetPasswordLink();
        forgetPasswordPage.insertEmail("email");
        forgetPasswordPage.clickOnRetrievePassword();

        String expectedResult = "Internal Server Error";
        assertEquals(forgetPasswordPage.getValidation(), expectedResult);
    }
}
