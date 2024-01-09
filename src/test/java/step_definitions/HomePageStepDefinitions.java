package step_definitions;

import headerComponents.UserOptions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObjects.HomePage;

public class HomePageStepDefinitions {
    private final HomePage homePage = new HomePage();
    private final UserOptions userOptions = new UserOptions();

    @Given("Customer open Home Page")
    public void openHomePage() {
        homePage.openHomePage();
    }


    @When("Guest click on the user button")
    public void clickOnUserButton() {
        userOptions.userButton();
    }

    @When("Customer click on the button Browse Events")
    public void customerClickOnTheButtonBrowseEvents() {
        userOptions.buttonBrowserEvents();
    }
    @When("Guest click on the  button My Tickets")
    public void guestClickOnTheButtonMyTickets() {
        userOptions.buttonMyTickets();
    }
    @When("Customer click on the button Help")
    public void customerClickOnTheButtonHelp() {
        userOptions.buttonHelp();
    }

    @And("Guest enter {string}")
    public void enterEmail(String email) {
        homePage.enterEmail(email);
    }

    @And("Guest enter{string}")
    public void guestEnter(String password) {
        homePage.enterPassword(password);
    }

    @And("Guest click on the LogIn button in the form registration")
    public void logInButton() {
        homePage.logInButton();
    }

    @And("Customer click on the button log in on the Home page")
    public void buttonLogIn() {
        homePage.loginButtonAvatar();
    }

    @And("Customer click on the Credits field in the popup Log in")
    public void buttonCredits() {
        homePage.buttonCredits();
    }

    @And("Customer click on the Messages field on the popup logIn")
    public void customerClickOnTheMessage() {
        homePage.buttonMessage();
    }

    @And("Customer click on the user name")
    public void customerClickOnTheUserName() {
        homePage.userName();
    }

    @Then("Check that the user{string} is logged in")
    public void checkThatTheUserIsLoggedIn(String expectedNameUser) {
        Assert.assertEquals(homePage.userLoggedIn(), expectedNameUser);
    }

    @Then("Check that the section one has {string}")
    public void titleOfSectionOne(String expectedTitleOfSectionOne) {
        Assert.assertEquals(homePage.titleOfSectionOne(),expectedTitleOfSectionOne);
    }

    @Then("Check that the section two has {string}")
    public void titleOfSectionTwo(String expectedTitleOfSectionTwo) {
        Assert.assertEquals(homePage.titleOfSectionTwo(),expectedTitleOfSectionTwo);
    }



}
