package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class AddLanguagePage extends CommonMethods {

    @FindBy(id="btnAdd")
    public WebElement addBtn;

    @FindBy(id="language_name")
    public WebElement addLangTextBox;

    @FindBy(id="btnSave")
    public WebElement saveBtn;

    @FindBy (id="menu_admin_viewLanguages")
    public WebElement addLangFromQualifications;

    public String langName = "Arabic";

    public AddLanguagePage(){
        PageFactory.initElements(driver, this);
    }
}
