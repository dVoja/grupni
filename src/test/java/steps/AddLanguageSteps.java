package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.util.List;

public class AddLanguageSteps extends CommonMethods {

    @When("clicks on login button")
    public void clicks_on_login_button() {
        click(login.loginButton);
    }
    @When("user navigates to Admin option")
    public void user_navigates_to_admin_option() {
        click(dashboardPage.adminOption);
    }
    @When("user clicks on languages from qualifications menu")
    public void user_clicks_on_languages_from_qualifications_menu() {
        click(dashboardPage.qualifications);
        click(addLanguagePage.addLangFromQualifications);
    }

    @Then("user is navigated to the language page")
    public void user_is_navigated_to_the_language_page() {
        click(dashboardPage.addLanguages);
    }
    @When("user clicks on add language button")
    public void user_clicks_on_add_language_button() {
        click(addLanguagePage.addBtn);
    }
    @When("user enters a name of a language and saves")
    public void user_enters_a_name_of_a_language_and_saves() {
        sendText(addLanguagePage.langName, addLanguagePage.addLangTextBox);
        click(addLanguagePage.saveBtn);
    }
    @Then("user has successfully added a language")
    public void user_has_successfully_added_a_language() {
        List<WebElement> langTable = driver.findElements(By.id("recordsListTable"));
    }
}
