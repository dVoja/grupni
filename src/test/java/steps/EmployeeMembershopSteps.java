package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class EmployeeMembershopSteps extends CommonMethods {


    @When("user clicks on My Info options")
    public void user_clicks_on_my_info_options() {
        click(employeeMyInfoPage.myInfoOption);
    }

    @Then("user navigates to the Memberships section")
    public void user_navigates_to_the_memberships_section() throws InterruptedException {
        click(employeeMyInfoPage.membershipOption);

    }
    @When("user clicks on a membership name in assigned memberships")
    public void user_clicks_on_a_membership_name_in_assigned_memberships() throws InterruptedException {
        Thread.sleep(3000);
        WebElement firstMember = driver.findElement(By.xpath("frmEmpDelMemberships/table/tbody/tr[1]/td[2]/a"));
        firstMember.click();
    }
    @When("user selects Membership from the Membership dropdown")
    public void user_selects_membership_from_the_membership_dropdown() {
        WebElement membershipDD = driver.findElement(By.id("membership_membership"));
        click(membershipDD);
        selectFromDropDown(membershipDD, "0123");
    }
    @When("user selects Subscription Paid By from the Subscription Paid By dropdown")
    public void user_selects_subscription_paid_by_from_the_subscription_paid_by_dropdown() {
        WebElement subscriptionPaidByDD = driver.findElement(By.id("membership_subscriptionPaidBy"));
        click(subscriptionPaidByDD);
        selectFromDropDown(subscriptionPaidByDD, "Company");
    }
    @When("user enters Subscription Amount into the Subscription Amount field")
    public void user_enters_subscription_amount_into_the_subscription_amount_field() {
        sendText("100", employeeMembershipPage.subscriptionAmount);
        click(employeeMembershipPage.subscriptionAmount);
    }
    @When("user selects Currency from the Currency dropdown")
    public void user_selects_currency_from_the_currency_dropdown() {
        click(employeeMembershipPage.currency);
        selectFromDropDown(employeeMembershipPage.currency, "Aruban Florin");
    }
    @When("user selects Subscription Commence Date from the Subscription Commence Date calendar")
    public void user_selects_subscription_commence_date_from_the_subscription_commence_date_calendar() {
        click(employeeMembershipPage.subCommenceDate);
    }
    @When("user selects Subscription Renewal Date from the Subscription Renewal Date calendar|")
    public void user_selects_subscription_renewal_date_from_the_subscription_renewal_date_calendar() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @When("employee enters Membership details")
    public void employee_enters_membership_details() {

    }
    @When("employee tries to save the membership details without filling in all mandatory fields")
    public void employee_tries_to_save_the_membership_details_without_filling_in_all_mandatory_fields() {

    }
    @Then("system displays an error message indicating that mandatory fields are missing")
    public void system_displays_an_error_message_indicating_that_mandatory_fields_are_missing() {
        WebElement errorMess = driver.findElement(By.xpath("//span[@class='validation-error']"));
        String actualMsg = errorMess.getText();
        Assert.assertEquals("Required", actualMsg);
    }

    @When("user clicks on a checkbox next to the saved membership and user clicks on a delete button")
    public void user_clicks_on_a_checkbox_next_to_the_saved_membership_and_user_clicks_on_a_delete_button() {
        click(employeeMembershipPage.checkBox);
        click(employeeMembershipPage.deleteBtn);
    }
    @Then("user successfully deleted the membership")
    public void user_successfully_deleted_the_membership() {
        System.out.println("membership deleted");

    }
}