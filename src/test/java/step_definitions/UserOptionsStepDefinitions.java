package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pageObjects.UserOptionsPage;

public class UserOptionsStepDefinitions {
    SoftAssert softAssert = new SoftAssert();
    private final UserOptionsPage userOptionsPage= new UserOptionsPage();

    @And("Customer click on the button All Cities")
    public void customerClickOnTheButtonAllCities() {
        userOptionsPage.buttonAllCities();
    }
    @And("Customer click on the button city")
    public void customerClickOnTheButtonCity() {
        userOptionsPage.buttonCity();
    }
    @Then("{string} is on the page")
    public void titleCreditsActivity(String expectedTitlePage) {
        softAssert.assertEquals(userOptionsPage.titleCreditsActivity(), expectedTitlePage);

    }

    @Then("{string} is on the page Credits")
    public void isOnThePageCredits(String expectedNameColumn) {
        softAssert.assertEquals(userOptionsPage.nameColumn(),expectedNameColumn);

        softAssert.assertEquals(userOptionsPage.nameColumn(),expectedNameColumn);
        softAssert.assertAll();
    }

    @Then("User messenger has {string}")
    public void pageMessenger(String expectedNameMessenger) {
        Assert.assertEquals(userOptionsPage.userName(),expectedNameMessenger);
    }


    @Then("Check that the selected {string} is indicated correctly on the navigation button")
    public void nameCityOnTheButton(String expectedNameCity){
        Assert.assertEquals(userOptionsPage.nameCity(),expectedNameCity);
    }

    @Then("Check Title the page has {string}")
    public void titlePage(String expectedTitlePage) {
        Assert.assertEquals(userOptionsPage.titlePage(),expectedTitlePage);
    }


    @Then("Check that the button Help open the page with {string}")
    public void titleHelpPage(String expectedTitleHelpPage) {
        Assert.assertEquals(userOptionsPage.titleHelpPage(),expectedTitleHelpPage);
    }

}
