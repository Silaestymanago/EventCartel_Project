package headerComponents;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class UserOptions {
    private final SelenideElement USER_BUTTON = $("[class='MuiBadge-root mui-style-1p53wq7']");
    private final SelenideElement BUTTON_BROWSER_EVENTS = $("[class='MuiTypography-root MuiTypography-span mui-style-le1023']");
    private final SelenideElement BUTTON_MY_TICKETS = $x("//span[contains(text(),'My Tickets')]");
    private final SelenideElement BUTTON_HELP = $x("//span[contains(text(),'Help')]");

    @Step("Click on the user button")
    public void userButton() {
        USER_BUTTON.click();
    }

    @Step("Click on the button Browser Events")
    public void buttonBrowserEvents() {
        BUTTON_BROWSER_EVENTS.click();
    }

    @Step("Click on the button My Tickets")
    public void buttonMyTickets() {
        BUTTON_MY_TICKETS.click();
    }

    @Step("Click on the button Help")
    public void buttonHelp() {
        BUTTON_HELP.click();
    }

}
