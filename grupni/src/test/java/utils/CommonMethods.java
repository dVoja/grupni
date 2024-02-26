package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Random;

public class CommonMethods extends PageInitializer{

    public static WebDriver driver;

    public void openBrowserAndLaunchApplication() {

        switch (ConfigReader.read("browser")){
            case "Chrome":
                driver=new ChromeDriver();
                break;
            case "FireFox":
                driver=new FirefoxDriver();
                break;
            case "Edge":
                driver = new EdgeDriver();
                break;
            case "Safari":
                driver = new SafariDriver();
                break;
            default:
                throw new RuntimeException("Invalid Browser Name");
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get(ConfigReader.read("url"));
        initializePageObjects(); // this method will call all the objects
    }

    public void closeBrowser() {
        if(driver!= null) {
            driver.quit();
        }
    }

    public void sendText(String text, WebElement element){
        element.clear();
        element.sendKeys(text);

    }
    public void selectFromDropDown(WebElement dropDown, String visibleText){
        Select sel =new Select(dropDown);
        sel.selectByVisibleText(visibleText);
    }
    public void selectFromDropDown(String value, WebElement dropDown ){
        Select sel =new Select(dropDown);
        sel.selectByValue(value);
    }
    public void selectFromDropDown( WebElement dropDown,int index ){
        Select sel =new Select(dropDown);
        sel.selectByIndex(index);
    }

    public WebDriverWait getwait(){
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(Constants.EXPLICIT_WAIT));
        return  wait;
    }

    public void waitForElementToBeClickAble(WebElement element){
        getwait().until(ExpectedConditions.elementToBeClickable(element));
    }

    public void click(WebElement element){
        waitForElementToBeClickAble(element);
        element.click();
    }

    public JavascriptExecutor getJSExecutor(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        return js;
    }

    public void jsClick(WebElement element){
        getJSExecutor().executeScript("arguments[0].click();", element);
    }

    public byte[] takeScreenshot(String fileName){
        // it accepts array of byte in cucumber for the screenshot
        TakesScreenshot ts = (TakesScreenshot) driver;
        byte[] picByte = ts.getScreenshotAs(OutputType.BYTES); // SS is taken in BYTES for so it can be embedded in reports
        File sourceFile = ts.getScreenshotAs(OutputType.FILE); // this will be saved in computer

        try {
            FileUtils.copyFile(sourceFile, new File(Constants.SCREENSHOT_FILEPATH +
                    fileName + " " + getTimeStamp("yyyy-MM-dd-HH-mm-ss") + ".png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return picByte;
    }

    public String getTimeStamp(String pattern){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(date);
    }
    public boolean isClickable(WebElement element) {
        boolean elementIsClicabkle = false;
        int timeoutInSeconds = 10;
        Duration timeout = Duration.ofSeconds(timeoutInSeconds);
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        WebElement clickableElement = wait.until(ExpectedConditions.elementToBeClickable(element));

        if (clickableElement != null) {
            return elementIsClicabkle = true;
        }
        return elementIsClicabkle;
    }

    public static boolean checkIfInputFieldsFilled(WebElement element) {
        String fieldValue = element.getAttribute("value");
        Boolean isFilled = false;
        if (!fieldValue.isEmpty()) {
            isFilled = true;
        }
        return isFilled;
    }

    public static void selectRandomDate(WebDriver driver) {

        var validDates = driver.findElements(By.className("ui-state-default"));
        int randomIndex = new Random().nextInt(validDates.size());
        validDates.get(randomIndex).click();
    }
}
