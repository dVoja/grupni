package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import utils.CommonMethods;

import java.util.List;
import java.util.Map;

public class AddDependentsSteps extends CommonMethods {
    @When("navigates to dependents section")
    public void navigates_to_dependents_section() {
        click(driver.findElement(By.xpath("//*[@id=\"menu_pim_viewMyDetails\"]/b")));
        click(driver.findElement(By.partialLinkText("Dependents")));

    }
    @Then("field should be clickable")
    public void field_should_be_clickable() {
        click(driver.findElement(By.id("btnAddDependent")));
        Assert.assertTrue(isClickable(driver.findElement(By.id("dependent_name"))));
        Assert.assertTrue(isClickable(driver.findElement(By.id("dependent_relationshipType"))));
        Assert.assertTrue(isClickable(driver.findElement(By.id("dependent_dateOfBirth"))));
    }
    @Then("employee can add multiple dependents")
    public void employee_can_add_multiple_dependents(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
        List<Map<String,String>> dependents = dataTable.asMaps();
        for(Map<String,String> dependent:dependents){
            sendText(dependent.get("name"), driver.findElement(By.id("dependent_name")));
            selectFromDropDown(driver.findElement(By.id("dependent_relationshipType")),dependent.get("relationship"));
            sendText(dependent.get("DOB"), driver.findElement(By.id("dependent_dateOfBirth")));
            click(driver.findElement(By.id("btnSaveDependent")));
            click(driver.findElement(By.id("btnAddDependent")));


        }
    }
    @Then("employee should be able to edit dependents")
    public void employee_should_be_able_to_edit_dependents() {
        click(driver.findElement(By.xpath("//*[@id=\"dependent_list\"]/tbody/tr[4]/td[2]")));
        String expectedMsg = "Add Dependent";
        String actualMsg = driver.findElement(By.id("heading")).getText();
        Assert.assertEquals(expectedMsg, actualMsg);
    }
}
