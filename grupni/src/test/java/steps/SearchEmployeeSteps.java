package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;

public class SearchEmployeeSteps extends CommonMethods {
    @When("Admin search for an employee using their full name {string}")
    public void admin_search_for_an_employee_using_their_full_name(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the search should return all matching employee records")
    public void the_search_should_return_all_matching_employee_records() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Admin search for an employee using their unique employee ID {string}")
    public void admin_search_for_an_employee_using_their_unique_employee_id(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the search should return the exact employee record associated with the provided employee ID")
    public void the_search_should_return_the_exact_employee_record_associated_with_the_provided_employee_id() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Admin search for an employee with non-existent criteria")
    public void admin_search_for_an_employee_with_non_existent_criteria() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the system should provide a message {string}")
    public void the_system_should_provide_a_message(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
