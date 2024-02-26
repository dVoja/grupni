package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class UpdateEmpPersonalInfoSteps extends CommonMethods {

    @When("employee enters employee username and password")
    public void employee_enters_employee_username_and_password() {
        login.enterEmpUsername();
        login.enterEmpPassword();
        click(login.loginButton);

    }
    @When("the employee navigates to the personal information section and clicks on edit")
    public void the_employee_navigates_to_the_personal_information_section_and_clicks_on_edit() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@id='menu_pim_viewMyDetails']/b")).click();
        driver.findElement(By.xpath("//*[@id='btnSave']")).click();
    }
    @Then("employee should be able to access and edit personal informatio")
    public void employee_should_be_able_to_access_and_edit_personal_informatio() {
        Assert.assertTrue(isClickable( driver.findElement(By.id("personal_txtEmpFirstName"))));
        Assert.assertTrue(isClickable(driver.findElement(By.id("personal_txtEmpMiddleName"))));
        Assert.assertTrue(isClickable(driver.findElement(By.id("personal_txtEmpLastName"))));
        Assert.assertTrue(isClickable(driver.findElement(By.id("personal_optGender_1"))));
        Assert.assertTrue(isClickable(driver.findElement(By.id("personal_optGender_2"))));
        Assert.assertTrue(isClickable(driver.findElement(By.id("personal_cmbNation"))));
        Assert.assertTrue(isClickable(driver.findElement(By.id("personal_cmbMarital"))));




    }
    @Then("employee update personal information and save the changes")
    public void employee_update_personal_information_and_save_the_changes() {
        sendText("Banana", driver.findElement(By.id("personal_txtEmpFirstName")));
        sendText("Julia",(driver.findElement(By.id("personal_txtEmpMiddleName"))));
        sendText("Hill",(driver.findElement(By.id("personal_txtEmpLastName"))));
        click(driver.findElement(By.id("personal_optGender_1")));
        selectFromDropDown(driver.findElement(By.id("personal_cmbNation")), "Serbian");
        selectFromDropDown(driver.findElement(By.id("personal_cmbMarital")), "Single");
        click(driver.findElement(By.xpath("//*[@id='btnSave']")));




    }

}
