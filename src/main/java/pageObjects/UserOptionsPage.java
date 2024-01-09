package pageObjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;

public class UserOptionsPage {
    private final SelenideElement TITLE_CREDITS_ACTIVITY = $x("//p[contains(text(),'Credits Activity')]");
    private final SelenideElement NAME_COLUMN = $("[class='MuiTypography-root MuiTypography-h1 mui-style-15kb3xq']");
    private final SelenideElement USER_NAME = $("[class='MuiTypography-root MuiTypography-body1 mui-style-1wjvvpg']");
    private final SelenideElement  BUTTON_ALL_CITIES = $("[class='MuiTypography-root MuiTypography-body1 mui-style-1kjnbdq']");
    private final ElementsCollection BUTTON_CITY = $$("[class='MuiTypography-root MuiTypography-body1 mui-style-a37mkz']");
    private final SelenideElement NAME_CITY = $("[class='MuiTypography-root MuiTypography-body1 mui-style-1kjnbdq']");
    private final SelenideElement TITLE_PAGE = $("[class='MuiTypography-root MuiTypography-h1 mui-style-nmxiwp']");
    private final SelenideElement TITLE_HELP_PAGE= $("[class='MuiTypography-root MuiTypography-body1 mui-style-b15vvc']");


    @Step("TC-002:step-4:Check that on the page Credits is title Credits Activity")
    public String titleCreditsActivity() {
        TITLE_CREDITS_ACTIVITY.shouldBe(Condition.visible);
        return TITLE_CREDITS_ACTIVITY.getText();
    }

    @Step("TC-002:step-5:Check that the column Account settings is on the page Credits")
    public String nameColumn() {
        return NAME_COLUMN.getText();
    }

    @Step("TC-003: Check that the user is Kate Halenko ")
    public String userName() {
        return USER_NAME.getText();

    }
    @Step("TC-006: Click on the button All Cities")
    public void buttonAllCities(){
        BUTTON_ALL_CITIES.click();
    }
    @Step("TC-006:Click on the button city")
    public void buttonCity(){
        BUTTON_CITY.get(17).click();
    }
    @Step("TC-006:Check that the selected City Name is indicated correctly on the navigation button ")
    public String nameCity(){
        return NAME_CITY.getText();
    }
    @Step("TC-007:Check the Button My Ticket open page Your Tickets")
    public String titlePage(){
        return TITLE_PAGE.getText();
    }
    @Step("TC-008:Check that the button Help open the ahelp page with title How can we help? ")
    public String titleHelpPage(){
        return TITLE_HELP_PAGE.getText();
    }

}
