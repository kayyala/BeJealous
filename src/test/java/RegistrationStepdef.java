import com.Pages.HomePage;
import com.Pages.RegisterPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Created by Sudhakar on 15/10/2017.
 */
public class RegistrationStepdef {
    //    WebDriver driver;
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();

    @Given("^I am on home page$")
    public void i_am_on_home_page() throws Throwable {
//        String CurrentURL = homePage.isInHome_page();
//        System.out.println("printing URL-- " + CurrentURL);
//        Assert.assertEquals(AutomationConstants.URL, CurrentURL);
        String mainpage =homePage.isin_homepage();
        Assert.assertEquals("MY ACCOUNT",mainpage);
        homePage.logininto();


    }

    @When("^I enter new user details$")
    public void i_enter_new_user_details() throws Throwable {

        homePage.newregister();
        registerPage.registrationdetails();


    }

    @Then("^I should log in sucessfully$")
    public void i_should_log_in_sucessfully() throws Throwable {
        String CurrentDashbord = registerPage.isinDshbordpage();
        Assert.assertEquals("My Dashboard", CurrentDashbord);
    }

    @And("^I should logout sucessfully$")
    public void iShouldLogoutSucessfully() throws Throwable {
        homePage.logout();
    }
}
