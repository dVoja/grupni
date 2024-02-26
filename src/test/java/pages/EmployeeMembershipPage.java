package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class EmployeeMembershipPage extends CommonMethods {
    @FindBy(xpath="//p[@id='listActions']//input[1]]")
    public WebElement addMembershipBtn;

    @FindBy(id="membership_membership")
    public WebElement membershipName;

    @FindBy(id="membership_subscriptionPaidBy")
    public WebElement subscriptionPaidBy;

    @FindBy(id="membership_subscriptionAmount")
    public WebElement subscriptionAmount;

    @FindBy(id="membership_currency")
    public WebElement currency;

    @FindBy(id="membership_subscriptionCommenceDate")
    public WebElement subCommenceDate;

    @FindBy(id="membership_subscriptionRenewalDate")
    public WebElement subRenewalDate;

    @FindBy(id="btnSaveMembership")
    public WebElement saveBtn;

    @FindBy(id="delMemsBtn")
    public WebElement deleteBtn;

    @FindBy(xpath="//input[@name='chkmemdel[]']")
    public WebElement checkBox;

    public EmployeeMembershipPage(){
        PageFactory.initElements(driver,this);
    }
}
