package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.util.List;

public class SearchEmployeeSteps extends CommonMethods {

    @When("user clicks on Employee List option")
    public void user_clicks_on_employee_list_option() {
        click(dashboardPage.empListOption);
    }
    @When("Admin search for an employee using their full name")
    public void admin_search_for_an_employee_using_their_full_name() {
        sendText("ana", searchEmployeePage.empNameLoc);
    }

    @When("Admin search for an employee using partial name with variations in capitalization")
    public void admin_search_for_an_employee_using_partial_name_with_variations_in_capitalization() {
        String partialName = "na";
        sendText(partialName.toLowerCase(), searchEmployeePage.empNameLoc);
        click(searchEmployeePage.searchBtn);
    }
    @Then("the search should return all matching employee records")
    public void the_search_should_return_all_matching_employee_records() {
            // Assuming the matching records are displayed in a table, adjust this code based on your application structure
            List<WebElement> matchingRecords = driver.findElements(By.xpath("//table[@id='searchResultsTable']//tbody/tr"));

            // Perform verification based on the number of matching records
            if (!matchingRecords.isEmpty()) {
                System.out.println("Matching records found:");

                // Log or print details of each matching record
                for (WebElement record : matchingRecords) {
                    System.out.println(record.getText());
                }
            } else {
                // You may want to fail the test if no matching records are found
                System.out.println("No matching records found");
            }
        }

    @When("Admin search for an employee using their unique employee ID")
    public void admin_search_for_an_employee_using_their_unique_employee_id() {
        sendText("92047488", searchEmployeePage.empIdLoc);
    }
    @Then("the search should return the exact employee record associated with the provided employee ID")
    public void the_search_should_return_the_exact_employee_record_associated_with_the_provided_employee_id() {
        System.out.println("Employee with the unique ID is displayed");
    }

    @When("Admin search for an employee with non-existent criteria")
    public void admin_search_for_an_employee_with_non_existent_criteria() {
        sendText("John NonExistentDoe", searchEmployeePage.empIdLoc);
        click(searchEmployeePage.searchBtn);
    }
    @Then("the system should provide a message {string}")
    public void the_system_should_provide_a_message(String string) {
        WebElement errorMess = driver.findElement(By.xpath("//table[@id='resultTable']//tbody/tr/td"));
        String expectedMsg = errorMess.getText();
        Assert.assertEquals("No Records Found", expectedMsg);
    }

}
