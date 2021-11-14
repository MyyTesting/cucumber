import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.plugin.Plugin;
import org.junit.runner.RunWith;

public class TestRunner {
    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = {"src/test/java/features/Shopping.feature"} , glue={"src/test/java/steps/StepDefinitions.java"},
   plugin = {"pretty","html:target/report.html"} )
    public class Runner{


    }

}
