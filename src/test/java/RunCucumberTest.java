import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"}, glue = {"steps"}, features = {"src/test/resources/features"})
public class RunCucumberTest{
}
