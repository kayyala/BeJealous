import Utiles.Utils.AutomationConstants;
import Utiles.Utils.BrowserFactory;
import Utiles.Utils.Utilities;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;

/**
 * Created by Sudhakar on 15/10/2017.
 */
public class Hooks
{
    public static WebDriver driver = BrowserFactory.getDriver();

    @Before
    public static void openBrowser() {
        try {
            BrowserFactory.startBrowser(AutomationConstants.BROWSER_TYPE, AutomationConstants.URL);
            driver = BrowserFactory.getDriver();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @After
    public void afterScenario(Scenario scenario) {
        System.out.println("scenario name: "+scenario.getName());
        if(scenario.isFailed() ) {
            Utilities.capturescreenshot(driver,scenario.getName());
        }
    }
}
