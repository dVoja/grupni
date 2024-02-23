package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class LanguageProficiencyPage extends CommonMethods {
    @FindBy (id="addLanguage")
    public WebElement addLangBtn;

    @FindBy (id="language_code")
    public WebElement languageName;

    @FindBy (id="language_lang_type")
    public WebElement fluencyOption;

    @FindBy (id="language_competency")
    public WebElement competencyOption;

    @FindBy (id="language_comments")
    public WebElement commentTextbox;

    @FindBy (id="btnLanguageSave")
    public WebElement saveBtn;

    @FindBy (xpath="//span[@class='validation-error']")
    public WebElement requiredMsg;

    @FindBy (xpath="//input[@name='delLanguage[]']")
    public WebElement checkBox;

    @FindBy (xpath="//input[@id='delLanguage']")
    public WebElement delLanguageBtn;

    public LanguageProficiencyPage(){
        PageFactory.initElements(driver, this);
    }
}
