package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class EmployeeMyInfoPage extends CommonMethods {
    @FindBy (id="menu_pim_viewMyDetails")
    public WebElement myInfoOption;

    @FindBy (xpath="//a[@href='/humanresources/symfony/web/index.php/pim/viewPersonalDetails/empNumber/97179']")
    public WebElement personalDetailsOption;

    @FindBy (xpath="//a[@href='/humanresources/symfony/web/index.php/pim/viewQualifications/empNumber/97179']")
    public WebElement qualificationsOption;

    @FindBy (xpath = "//a[@href='/humanresources/symfony/web/index.php/pim/viewMemberships/empNumber/97179']")
    public WebElement membershipOption;

    public EmployeeMyInfoPage(){
        PageFactory.initElements(driver, this);
    }
}
