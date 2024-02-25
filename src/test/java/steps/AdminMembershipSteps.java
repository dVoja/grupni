package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.util.List;

public class AdminMembershipSteps extends CommonMethods {
    @When("user clicks on Qualifications option")
    public void user_clicks_on_qualifications_option() {
        click(dashboardPage.qualifications);
    }

    @When("user clicks on Membership option")
    public void user_clicks_on_membership_option() {
        click(dashboardPage.membershipOption);
    }

    @When("user clicks on add button")
    public void user_clicks_on_add_button() {
        click(adminMembershipsPage.addBtn);
    }

    @When("user enters a membership name")
    public void user_enters_a_membership_name() throws InterruptedException {
        sendText(adminMembershipsPage.membershipName, adminMembershipsPage.membershipNameTextBox);
        Thread.sleep(5000);

    }

    @When("user clicks on the save button")
    public void user_clicks_on_the_save_button() {
        click(adminMembershipsPage.saveBtn);
    }

    @Then("a membership is added successfully")
    public void a_membership_is_added_successfully() {
        System.out.println("Membership added successfully");
        WebElement alreadyExistMsg = driver.findElement(By.xpath("//span[@class='validation-error']"));
        String getValue = alreadyExistMsg.getText();
        Assert.assertEquals("Already exists", getValue);
        System.out.println("Membership has been already added");

    }
}

