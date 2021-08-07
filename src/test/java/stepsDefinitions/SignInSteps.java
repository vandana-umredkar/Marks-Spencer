package stepsDefinitions;

import hooksMethods.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObjectModel.HomePage;
import pageObjectModel.SchoolDresses;
import pageObjectModel.SignInPage;
import pageObjectModel.SignOutPage;
import utils.CommonFunctions;

public class SignInSteps extends CommonFunctions {
    HomePage homePage;
    SignInPage signInPage;
    SignOutPage signOutPage;
    SchoolDresses schoolDresses;
    Hooks hooks = new Hooks();
    @Given("I am on the home page")
    public void i_am_on_the_home_page() {
        hooks.beforeTest();
        homePage = new HomePage(driver);
        signInPage = new SignInPage(driver);
        signOutPage = new SignOutPage(driver);
        schoolDresses = new SchoolDresses(driver);
        driver.manage().window().maximize();
        driver.get(msUrl);
        String expectedTitle = "Welcome to Marks & Spencer";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);

    }
    @When("I am on the signInMouseHover")
    public void iAmOnTheSignInMouseHover() {
        homePage.signInMouseHovering();
    }
    @When("I click on SignIn")
    public void i_click_on_sign_in() throws InterruptedException {

        homePage.clickSignIn();

    }
    @And("I enter emailId as {string}")
    public void iEnterEmailIdAs(String userId)  {
        signInPage.validateSignInPage();
    signInPage.enterEmailId(userId);
    }

    @And("I enter password as {string}")
    public void iEnterPasswordAs(String password1) {
        signInPage.enterPassword(password1);
    }
    @When("I click on signIn button")
    public void i_click_on_sign_in_button() {
        signInPage.clickOnSignInButton();

    }
    @And("I am on the schoolMouseHover")
    public void iAmOnTheSchoolMouseHover() {
        signOutPage.schoolMouseHovering();
    }
    @And("I click on dresses")
    public void iClickOnDresses() {
        signOutPage.clickDresses();
    }
    @Then("I should  be redirected to school dresses page and get relevant products.")
    public void iShouldBeRedirectedToSchoolDressesPageAndGetRelevantProducts() {
          schoolDresses.validateSchoolDressesPage();
          hooks.afterTest();
    }
   // @Then("I should be able to login and should be redirected to profile page")
    //public void i_should_be_able_to_login_and_should_be_redirected_to_profile_page() {
      //signOutPage.validateSignOutPage();
      //hooks.afterTest();
    //}



}
