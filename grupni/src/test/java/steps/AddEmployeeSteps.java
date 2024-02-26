package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;
import utils.ConfigReader;

import java.io.ObjectInputFilter;

public class AddEmployeeSteps extends CommonMethods {

    String searchedName = "ana banana";
    @When("user clicks on PIM option")
    public void user_clicks_on_pim_option() {
       click(dashboardPage.pimOption);
    }
    @When("user clicks on Add Employee option")
    public void user_clicks_on_add_employee_option() {
        click(dashboardPage.addEmployeeOption);
    }
    @When("user enters a first name and middle name and last name")
    public void user_enters_a_first_name_and_middle_name_and_last_name() {
    sendText("a", addEmployeePage.firstNameLoc);
    sendText("b", addEmployeePage.middleNameLoc);
    sendText("c", addEmployeePage.lastNameLoc);
    }
    @When("user clicks on a save button")
    public void user_clicks_on_a_save_button() {
        click(addEmployeePage.saveButton);
    }
    @Then("user successfully added employee by providing first name and middle name and last name")
    public void user_successfully_added_employee_by_providing_first_name_and_middle_name_and_last_name() {
        System.out.println("Employee added successfully");
    }

    @When("user submits incomplete employee information")
    public void user_submits_incomplete_employee_information() {
    sendText("v", addEmployeePage.firstNameLoc);
    sendText("d", addEmployeePage.middleNameLoc);
    }

    @When("user clicks on save button")
    public void user_clicks_on_save_button() {

        click(addEmployeePage.saveButton);
    }

    @Then("user should see {string} near the respective input fields")
    public void user_should_see_error_message_near_the_respective_input_field (String errorMessage) {

    String errorMess = addEmployeePage.errorMsgLoc.getText();
    Assert.assertEquals(errorMessage, errorMess);
    }

    @Then("user successfully added employee by providing employee ID")
    public void userSuccessfullyAddedEmployeeByProvidingEmployeeID() {
        System.out.println("Employee added by providing ID");
    }

    @When("user enters {string}, {string}, {string} and {string} and clicks on save")
    public void user_enters_and_and_clicks_on_save
            (String firstName, String middleName, String lastName, String empID) {
        sendText("ksenija", addEmployeePage.firstNameLoc);
        sendText("k", addEmployeePage.middleNameLoc);
        sendText("D", addEmployeePage.lastNameLoc);
        sendText("92047488", addEmployeePage.empIdLoc);
        click(addEmployeePage.saveButton);

    }
}
