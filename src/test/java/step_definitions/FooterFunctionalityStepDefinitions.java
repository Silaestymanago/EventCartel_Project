package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObjects.FooterFunctionality;

public class FooterFunctionalityStepDefinitions {
    private final FooterFunctionality footerFunctionality = new FooterFunctionality();

    @When("Customer click on the button Support Chat")
    public void customerClickOnTheButtonSupportChat() {
        footerFunctionality.buttonSupportChat();

    }

    @When("Customer click on the button language")
    public void customerClickOnTheButtonLanguage() {
        footerFunctionality.buttonLanguage();
    }

    @And("Customer click button RU")
    public void customerClickButtonRU() {
        footerFunctionality.buttonRU();
    }
    @Then("{string} open")
    public void open(String expectedNamePopup) {
       Assert.assertEquals( footerFunctionality.popupHelp(),expectedNamePopup);
    }

    @Then("Check that the {string} translate into russian")
    public void titleTranslateIntoRussian(String expectedTitleTranslate) {
        Assert.assertEquals(footerFunctionality.titleTranslateHomePage(),expectedTitleTranslate);
    }



}
