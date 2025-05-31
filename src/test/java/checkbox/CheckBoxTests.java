package checkbox;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.CheckBoxPage;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class CheckBoxTests extends BaseTests {

    @Test
    public void testCheckBox(){
        CheckBoxPage checkBoxPage = homePage.clickOnCheckBoxLink();
        checkBoxPage.clickCheckBox1();
        checkBoxPage.clickCheckBox2();
        assertTrue(checkBoxPage.checkBoxOneIsSelected());
        assertFalse(checkBoxPage.checkBoxTwoIsSelected());
    }
}
