package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class AdminMembershipsPage extends CommonMethods {
    @FindBy (id="btnAdd")
    public WebElement addBtn;

    @FindBy (id="membership_name")
    public WebElement membershipNameTextBox;

    @FindBy (id="btnSave")
    public WebElement saveBtn;

    public String membershipName= "Platinum";

    public AdminMembershipsPage(){
        PageFactory.initElements(driver, this);
    }
}
