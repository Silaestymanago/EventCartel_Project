package pageObjects;

import com.codeborne.selenide.*;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;

public class HomePage {
    private final SelenideElement ENTER_EMAIL = $("[class='MuiInputBase-input mui-style-tnuk42']");
    private final SelenideElement ENTER_PASSWORD = $("#field-password");
    private final SelenideElement LOGIN_BUTTON = $("[class='MuiButtonBase-root MuiButton-root MuiButton-contained_ffffff_3a66e5_3a66e5 MuiButton-contained_ffffff_3a66e5_3a66e5Primary MuiButton-sizeMedium MuiButton-contained_ffffff_3a66e5_3a66e5SizeMedium MuiButton-root MuiButton-contained_ffffff_3a66e5_3a66e5 MuiButton-contained_ffffff_3a66e5_3a66e5Primary MuiButton-sizeMedium MuiButton-contained_ffffff_3a66e5_3a66e5SizeMedium mui-style-1b323c2']");
    private final SelenideElement LOGIN_BUTTON_AVATAR = $("[class='MuiAvatar-img mui-style-1hy9t21']");
    private final SelenideElement USER_LOGGED_IN = $("[class='MuiTypography-root MuiTypography-body1 mui-style-1qphlge']");
    private final SelenideElement BUTTON_CREDITS = $("[class='MuiTypography-root MuiTypography-span mui-style-lvj1p1']");
    private final ElementsCollection BUTTONS_POPUP_LOG = $$("[class='MuiTypography-root MuiTypography-span mui-style-lvj1p1']");
    private final ElementsCollection USER_NAME = $$("[class='MuiTypography-root MuiTypography-body1 mui-style-1j722sx']");
    private final SelenideElement POPUP_MESSAGES = $("[class='MuiBox-root mui-style-12csbj0']");
    private final ElementsCollection TITLE_OF_SECTION = $$("[class='MuiTypography-root MuiTypography-h2 mui-style-su42ms'");



    public void openHomePage() {
        open("https://backery.eventcartel.com/");
        WebDriverRunner.getWebDriver().manage().window().maximize();
        Configuration.timeout = 10000;
    }



    @Step("TC-001:step-1:Enter Email")
    public void enterEmail(String email) {
        ENTER_EMAIL.click();
        ENTER_EMAIL.sendKeys(email);
    }

    @Step("TC-001:step-2:Enter Password")
    public void enterPassword(String password) {
        ENTER_PASSWORD.click();
        ENTER_PASSWORD.sendKeys(password);
    }

    @Step("TC-001:step-3:Guest log in button click in the form registration")
    public void logInButton() {
        LOGIN_BUTTON.click();
    }

    @Step("TC-001:step-4:Customer click on the button log in on the Home page")
    public void loginButtonAvatar() {
        LOGIN_BUTTON_AVATAR.hover();
    }

    @Step("TC-001:step-5:Check that the user has successfully logged in")
    public String userLoggedIn() {
        return USER_LOGGED_IN.getText();
    }

    @Step("TC-002: step-4:Check that the button Credit open page Credit Activity")
    public void buttonCredits() {
        BUTTON_CREDITS.shouldBe(Condition.visible);
        BUTTON_CREDITS.click();

    }
    @Step("TC-003:Click on the button message")
    public void buttonMessage(){
        BUTTONS_POPUP_LOG.get(1).click();
    }
    @Step("TC-003:Click on the user name")
    public void userName(){
        POPUP_MESSAGES.shouldBe(Condition.visible).shouldHave(Condition.text("Kate Halenko"));
        USER_NAME.get(0).click();
    }
    @Step("TC-004:Check that the title of the section Popular Events In is Popular Events In ")
    public String titleOfSectionOne(){
        return TITLE_OF_SECTION.get(0).getText();
    }
    @Step("TC-005:Check that the title of the section Popular Tours is Popular Tours  ")
    public String titleOfSectionTwo(){
        return TITLE_OF_SECTION.get(1).getText();
    }
}
