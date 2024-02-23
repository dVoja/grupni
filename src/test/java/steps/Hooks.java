package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.CommonMethods;
import io.cucumber.java.Scenario;

public class Hooks extends CommonMethods {
    @Before
    //this method will always execute before every scenario
    //because it has @before tag which is pre-condition
    public void start(){
        openBrowserAndLaunchApplication();
    }

    @After
    //this method will always execute before every scenario
    //because it has @after tag which is pre-condition
    public void close(){
        closeBrowser();
    }

}
