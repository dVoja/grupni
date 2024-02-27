package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;
import utils.ConfigReader;

public class SearchEmployeePage extends CommonMethods {


    @FindBy(id="empsearch_id")
    public WebElement empIdLoc;

    @FindBy(id="empsearch_employee_name_empName")
    public WebElement empNameLoc;

    @FindBy(xpath="//input[@id='searchBtn']")
    public WebElement searchBtn;

    public String empId = "92047488";

    public void enterEmployeeName(){
        sendText(ConfigReader.read("employeeSearchName"), searchEmployeePage.empNameLoc);
    }

    public SearchEmployeePage(){
        PageFactory.initElements(driver,this);
    }

}