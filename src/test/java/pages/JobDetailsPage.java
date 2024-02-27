package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class JobDetailsPage extends CommonMethods {
    @FindBy(id="job_job_title")
    public WebElement jobTitle;
    @FindBy(id="job_emp_status")
    public WebElement emplymntStatus;
    @FindBy(id="job_eeo_category")
    public WebElement jobCat;
    @FindBy(id="job_joined_date")
    public WebElement joinDate;
    @FindBy(id="job_sub_unit")
    public WebElement subUnit;
    @FindBy(id="job_location")
    public WebElement jobLocation;
    @FindBy(id="job_contract_start_date")
    public WebElement jobContractStartDate;
    @FindBy(id="job_contract_end_date")
    public WebElement jobContractEndDate;
    @FindBy(id="job_contract_file")
    public WebElement contactFile;
    @FindBy(id="btnSave")
    public WebElement saveJobButton;

    @FindBy(className ="fadable")
    public WebElement fadingMessage;

    public JobDetailsPage(){
        PageFactory.initElements(driver,this);
    }
}
