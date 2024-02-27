package steps;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import utils.CommonMethods;

public class AddWorkExpSteps extends CommonMethods {
    @Then("navigate to work experience section")
    public void navigate_to_work_experience_section() {
        click(driver.findElement(By.xpath("//*[@id=\"menu_pim_viewMyDetails\"]/b")));
        click(driver.findElement(By.partialLinkText("Qualifications")));
        click(driver.findElement(By.id("addWorkExperience")));

    }
    @Then("check are fields editable")
    public void check_are_fields_editable() {
        Assert.assertTrue(isClickable(driver.findElement(By.id("experience_employer"))));
        Assert.assertTrue(isClickable(driver.findElement(By.id("experience_jobtitle"))));
        Assert.assertTrue(isClickable(driver.findElement(By.id("experience_from_date"))));
        Assert.assertTrue(isClickable(driver.findElement(By.id("experience_to_date"))));
        Assert.assertTrue(isClickable(driver.findElement(By.id("experience_comments"))));

    }
    @Then("validate mandatory fields are entered before saving work experience")
    public void validate_mandatory_fields_are_entered_before_saving_work_experience() {
        sendText("asd", driver.findElement(By.id("experience_employer")));
        sendText("wdasda",driver.findElement(By.id("experience_jobtitle")));
        sendText("2024-02-07", driver.findElement(By.id("experience_from_date")));
        sendText("2024-02-07", driver.findElement(By.id("experience_to_date")));
        sendText("wdasd", driver.findElement(By.id("experience_comments")));


        Assert.assertTrue(checkIfInputFieldsFilled(driver.findElement(By.id("experience_employer"))));
        Assert.assertTrue(checkIfInputFieldsFilled(driver.findElement(By.id("experience_jobtitle"))));
        Assert.assertTrue(checkIfInputFieldsFilled(driver.findElement(By.id("experience_from_date"))));
        Assert.assertTrue(checkIfInputFieldsFilled(driver.findElement(By.id("experience_to_date"))));
        Assert.assertTrue(checkIfInputFieldsFilled(driver.findElement(By.id("experience_comments"))));
        click(driver.findElement(By.id("btnWorkExpSave")));
    }
    @Then("employee can edit work previously entered work experience")
    public void employee_can_edit_work_previously_entered_work_experience() {
        click(driver.findElement(By.partialLinkText("asd")));
    }
}
