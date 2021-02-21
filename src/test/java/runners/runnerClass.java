package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","html:target/cucumber-reports/cucumber-pretty"
        },
//    plugin = {
//        "html:target/cucumberHtmlReport",
//        "json:target/cucumber-report.json"
//    }, // Plugin to generate HTML report and json report
        features = {
                "src/test/resources/Features"
        },
        glue = {
                "runners","stepdefs"
        }
       )
public class runnerClass {
}
