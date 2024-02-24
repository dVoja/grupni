package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class LoginSteps extends CommonMethods {
    @When("user enters admin username and password")
    public void user_enters_admin_username_and_password() {
        login.enterUsername();
        login.enterPassword();
    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        click(login.loginButton);
    }
    @Then("user is successfully logged in")
    public void user_is_successfully_logged_in() {
        WebElement welcomeMessage = driver.findElement(By.id("welcome"));
        Assert.assertTrue(welcomeMessage.isDisplayed());
        System.out.println("My test is passed");
    }
    @When("user enters {string} and {string} and verify the {string}")
    public void user_enters_and_and_verify_the(String usernameValue, String passwordValue, String errorMessage) {
        sendText(usernameValue, login.usernameField);
        sendText(passwordValue, login.passwordField);
        click(login.loginButton);
        //to get the error message, we need this web element
        WebElement errorLoc = driver.findElement(By.id("spanMessage"));
        String errorMessageValue = errorLoc.getText();
        //System.out.println(errorMessageValue);
        //validation of error message is pending

        Assert.assertEquals(errorMessage, errorMessageValue);
    }
    @When("user enters employee username and password")
    public void user_enters_employee_username_and_password() {
        login.enterEmpUsername();
        login.enterEmpPassword();
    }


}
