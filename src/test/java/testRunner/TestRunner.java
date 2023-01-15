package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/feature"},
        glue = {"steps"},
        plugin = {"pretty", "html:TestReportCucumber/Report.html", "junit:TestReportCucumber/Report.junit"},
        monochrome = true
)
public class TestRunner {



}
