package pageObjects;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;


public class FooterFunctionality {

    private final SelenideElement BUTTON_SUPPORT_CHAT = $x("//button[contains(text(),'Support Chat')]");
    private final SelenideElement POPUP_HELP = $("[class='wrap_bbc7']");
    private final SelenideElement BUTTON_LANGUAGE = $("[class='MuiNativeSelect-select MuiNativeSelect-standard MuiInputBase-input MuiInput-input mui-style-qgdms']");
    private final SelenideElement BUTTON_RU = $x("//option[contains(text(),'russian')]");
    private final SelenideElement TITLE_TRANSLATE_RU = $("[class='MuiTypography-root MuiTypography-body1 mui-style-r3neo0']");


    @Step("TC-009:Click on the button Support Chat")
    public void buttonSupportChat() {
        BUTTON_SUPPORT_CHAT.click();
    }

    @Step("TC-009: Check that the button Support Chat open popup Help")
    public String popupHelp() {
        return POPUP_HELP.getText();
    }

    @Step("TC-010:Click on the button language")
    public void buttonLanguage() {
        BUTTON_LANGUAGE.click();
    }

    @Step("TC-010:Click on the button ru")
    public void buttonRU() {
        BUTTON_RU.click();
    }

    @Step("TC-010:Check that the Title Home Page translate into russian")
    public String titleTranslateHomePage() {
        TITLE_TRANSLATE_RU.shouldBe(visible).shouldHave(text("ВАШ БИЛЕТ НА ПРЯМЫЕ ТРАНСЛЯЦИИ"));
        return TITLE_TRANSLATE_RU.getText();
    }
}

