import browser.Singletone;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import pages.MainPage;
import utils.JsonUtils;
import utils.SettingsConstants;

public class TestClass {

    WebDriver driver;

    @BeforeClass
    public void setUp(){
        Singletone.getDriver().get(JsonUtils.getJsonValue(SettingsConstants._configJson, SettingsConstants._mainPageUrl));
        Singletone.getDriver().manage().window().maximize();
}

    @Test
    public void testMethod(){

        MainPage mainPage = new MainPage();
        mainPage.clickPricesButton();
    }

    @AfterClass
    public void tearDown() {
        // Close the browser window
        if (driver != null) {
            driver.quit();
        }
    }
}
