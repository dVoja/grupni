package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;
import utils.ConfigReader;

public class TerminateEmployeeStep extends CommonMethods {
    @When("user accesses the list of employees in the system")
    public void user_accesses_the_list_of_employees_in_the_system() {
        click(dashboardPage.pimOption);
        click(dashboardPage.empListOption);

    }
    @When("selects a specified employee from the list")
    public void selects_a_specified_employee_from_the_list() {
        sendText(ConfigReader.read("TerminateId"),driver.findElement(By.id("empsearch_id")));
        click(driver.findElement(By.id("searchBtn")));
        click(driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr[1]/td[2]/a")));
    }
    @When("navigates to the employee's job page")
    public void navigates_to_the_employee_s_job_page() {
        click(driver.findElement(By.xpath("//*[@id=\"sidenav\"]/li[6]/a")));
    }
    @When("selects the option to terminate the employment of the specified employee")
    public void selects_the_option_to_terminate_the_employment_of_the_specified_employee() {
        click(driver.findElement(By.id("btnTerminateEmployement")));

    }
    @Then("specified employee is terminated")
    public void specified_employee_is_terminated() {
        click(driver.findElement(By.id("dialogConfirm")));
    }
}
