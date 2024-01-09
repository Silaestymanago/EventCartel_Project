package runnerCucumber;

import com.codeborne.selenide.Screenshots;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.google.common.io.Files;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.qameta.allure.Attachment;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;

import static com.codeborne.selenide.Selenide.open;

@CucumberOptions(
        features = "C:\\Autonation\\ProjectEvenCartel\\src\\test\\resources\\features",
        glue = "step_definitions",
        plugin = { "pretty", "io.qameta.allure.cucumberjvm.AllureCucumberJvm" }
)

public class RunnerCucumberTest extends AbstractTestNGCucumberTests {
    @BeforeTest
    public void setUp() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true));
        open();
    }
    @AfterTest
    public void tearDown() throws IOException {
        screenshot();
    }

    @Attachment(type = "image/png")
    public byte[] screenshot() throws IOException {
        File screenshot = Screenshots.takeScreenShotAsFile();
        return screenshot == null ? null : Files.toByteArray(screenshot);
    }
}
