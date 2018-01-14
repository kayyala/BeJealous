import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Sudhakar on 15/10/2017.
 */

@RunWith(Cucumber.class)
@CucumberOptions(format = "html:target/Cucumber.html",
        tags = "@register",
        features = "src/main/resources/Registration.feature")
public class RunnerTest {
}
