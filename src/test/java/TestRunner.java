import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features",
        glue = {"steps"},
        plugin = {"pretty", "html:target/Report/TestResults.html"},
        monochrome = true,
        tags = ("@UItest") //pass the tags of the scenarios you want to be executed
)

public class TestRunner {
}
