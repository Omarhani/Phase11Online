package wait;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DynamicLoadingPage;
import pages.OnePage;

import static org.testng.Assert.assertEquals;

public class DynamicLoadingTests extends BaseTests {

    @Test
    public void testExampleOne() {
        DynamicLoadingPage dynamicLoadingPage = homePage.clickOnDynamicLoadingLink();
        OnePage onePage = dynamicLoadingPage.clickExampleOneLink();
        onePage.clickStartButton();
        assertEquals(onePage.getValidation(), "Hello World!");
    }
}
