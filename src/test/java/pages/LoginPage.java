package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;
import utils.ConfigReader;

public class LoginPage extends CommonMethods {

    @FindBy(id = "txtUsername")
    public WebElement usernameField;

    @FindBy(id = "txtPassword")
    public WebElement passwordField;

    @FindBy(id = "btnLogin")      //ili ovako byXpath   //@FindBy(xpath="//*[@id='btnLogin'])
    public WebElement loginButton;

    @FindBy(id = "spanMassage")
    public WebElement errorMessageLoc;

    public void enterUsername(){
        sendText(ConfigReader.read("userName"), login.usernameField);
    }
    public void enterPassword(){
        sendText(ConfigReader.read("password"), login.passwordField);
    }

    public void clickLoginButton(){
        click(login.loginButton);
    }
    public void enterEmpUsername(){
        sendText(ConfigReader.read("employeeUsername"), login.usernameField);
    }
    public void enterEmpPassword(){
        sendText(ConfigReader.read("employeePassword"), login.passwordField);
    }



    public LoginPage() {
        //page factory we use to initialize all the ele and driver we pass as an argument to it. This keyword means,we need to initialize all the ele of this class
        PageFactory.initElements(driver, this);
    }
}