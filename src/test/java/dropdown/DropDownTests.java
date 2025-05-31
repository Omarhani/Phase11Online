package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DropDownPage;

public class DropDownTests extends BaseTests {

    @Test
    public void testDropdownList(){
        DropDownPage dropDownPage = homePage.clickOnDropDownLink();
        dropDownPage.selectFromDropDownList("Option 2");
    }
}
