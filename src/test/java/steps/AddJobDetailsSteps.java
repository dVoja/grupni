package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.util.List;
import java.util.Map;

public class AddJobDetailsSteps extends CommonMethods {
    @When("the Admin user accesses the employee's profile")
    public void the_admin_user_accesses_the_employee_s_profile() {
        click(dashboardPage.pimOption);
        click(dashboardPage.empListOption);
        click(driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr[1]/td[2]/a")));
    }
    @When("navigates to the current job details section")
    public void navigates_to_the_current_job_details_section() {
        click(driver.findElement(By.xpath("//*[@id=\"sidenav\"]/li[6]/a")));

    }
    @Then("the following fields should be displayed and editable")
    public void the_following_fields_should_be_displayed_and_editable() {
        click(driver.findElement(By.id("btnSave")));
        isClickable(jobDetailsPage.jobTitle);
        isClickable(jobDetailsPage.emplymntStatus);
        isClickable(jobDetailsPage.jobCat);
        isClickable(jobDetailsPage.joinDate);
        isClickable(jobDetailsPage.subUnit);
        isClickable(jobDetailsPage.jobLocation);
        isClickable(jobDetailsPage.jobContractStartDate);
        isClickable(jobDetailsPage.jobContractEndDate);
        isClickable(jobDetailsPage.contactFile);
    }
    @Given("the Admin user has filled in the mandatory current job details:")
    public void the_admin_user_has_filled_in_the_mandatory_current_job_details(io.cucumber.datatable.DataTable dataTable) {
        List<Map<String,String>> jobDetails = dataTable.asMaps();
        for (Map<String,String> jobDetail:jobDetails) {

            selectFromDropDown(jobDetailsPage.jobTitle,jobDetail.get("jobTitle"));
            selectFromDropDown(jobDetailsPage.emplymntStatus, jobDetail.get("employmentStatus"));
            selectFromDropDown(jobDetailsPage.jobCat, jobDetail.get("jobCategory"));
            sendText(jobDetail.get("joinedDate"), jobDetailsPage.joinDate);
            selectFromDropDown(jobDetailsPage.subUnit, jobDetail.get("subUnit"));
            selectFromDropDown(jobDetailsPage.jobLocation, jobDetail.get("location"));
            sendText(jobDetail.get("startDate"), jobDetailsPage.jobContractStartDate);
            sendText(jobDetail.get("endDate"), jobDetailsPage.jobContractEndDate);

        }
    }
    @When("the Admin user saves the current job details")
    public void the_admin_user_saves_the_current_job_details() {
        click(jobDetailsPage.saveJobButton);
    }
    @Then("the system should store the current job details in the employee's profile")
    public void the_system_should_store_the_current_job_details_in_the_employee_s_profile() {
        String expectedMessage = "Successfully Updated";
        String actualMessage = jobDetailsPage.fadingMessage.getText();
        Assert.assertEquals(expectedMessage,actualMessage);
    }

    @Given("the mandatory fields are not filled in:")
    public void the_mandatory_fields_are_not_filled_in() {
        System.out.println("nothing needs to be changed");
    }
    @When("the Admin user tries to save the current job details")
    public void the_admin_user_tries_to_save_the_current_job_details() {
        System.out.println("will save in next step");
    }
    @Then("system should display error message and not store job details")
    public void system_should_display_error_message_and_not_store_job_details() throws InterruptedException {
        click(driver.findElement(By.xpath("//*[@id=\"btnSave\"]"))); // bugs out sometimes ?
        Thread.sleep(100);
        String expectedMessage = "Please enter valid data";
        String actualMessage = jobDetailsPage.fadingMessage.getText();
        Assert.assertEquals(expectedMessage,actualMessage);
    }
}
