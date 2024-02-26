package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class EmployeeDashboardPage extends CommonMethods {
    @FindBy(xpath ="//a[@id='menu_pim_viewMyDetails']/b")
    public WebElement MyInfo;
    @FindBy(xpath = "//*[@id='btnSave']")
    public WebElement EditEmployeeInfo;

    @FindBy(id="personal_txtEmpFirstName")
    public WebElement EditFirstName;

    @FindBy(id="personal_txtEmpMiddleName")
    public WebElement EditMiddleName;

    @FindBy(id="personal_txtEmpLastName")
    public WebElement EditLastName;

    @FindBy(id="personal_optGender_1")
    public WebElement MaleOption;

    @FindBy(id="personal_optGender_2")
    public WebElement FemaleOption;

    @FindBy(id="personal_cmbNation")
    public WebElement Nationality;

    @FindBy(id="personal_cmbMarital")
    public WebElement MaritalStatus;


    public EmployeeDashboardPage(){
        PageFactory.initElements(driver,this);
    }
}
