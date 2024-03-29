package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//we need runwith options to run cucumber with junit
@RunWith(Cucumber.class)
//cucumber options decide what to execute, where to execute
@CucumberOptions(
        //features we use to provide the path of the feature files
        features = "src/test/resources/features",
        glue = "steps",
        dryRun = false,
        tags = "@UpdateEmpInfo",
        plugin = {"pretty","html:target/cucumber.html", "json:target/cucumber.json", "rerun:target/failed.txt"}
)

public class RunnerClass {

}
