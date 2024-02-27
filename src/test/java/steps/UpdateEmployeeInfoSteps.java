package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.util.Arrays;
import java.util.List;

public class UpdateEmployeeInfoSteps extends CommonMethods {
    @When("employee enters employee username and password")
    public void employee_enters_employee_username_and_password() {
        login.enterEmpUsername();
        login.enterEmpPassword();
        click(login.loginButton);
    }
    @When("the employee navigates to the personal information section and clicks on edit")
    public void the_employee_navigates_to_the_personal_information_section_and_clicks_on_edit() {
        click(updateEmployeePage.MyInfo);
        click(updateEmployeePage.EditEmployeeInfo);
    }
    @Then("employee should be able to access and edit personal information")
    public void employee_should_be_able_to_access_and_edit_personal_information() {
        List<WebElement> clickableElements = Arrays.asList(
                updateEmployeePage.EditFirstName,
                updateEmployeePage.EditMiddleName,
                updateEmployeePage.EditLastName,
                updateEmployeePage.MaleOption,
                updateEmployeePage.FemaleOption,
                updateEmployeePage.Nationality,
                updateEmployeePage.MaritalStatus
        );

        for (WebElement element : clickableElements) {
            Assert.assertTrue(isClickable(element));
        }
    }
    @Then("employee update personal information and save the changes")
    public void employee_update_personal_information_and_save_the_changes() {
        sendText("Banana", updateEmployeePage.EditFirstName);
        sendText("Julia", updateEmployeePage.EditMiddleName);
        sendText("Hill", updateEmployeePage.EditLastName);
        click(updateEmployeePage.FemaleOption);
        selectFromDropDown(updateEmployeePage.Nationality, "Serbian");
        selectFromDropDown(updateEmployeePage.MaritalStatus, "Single");
        click(updateEmployeePage.EditEmployeeInfo);
    }
}
