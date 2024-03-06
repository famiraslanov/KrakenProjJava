import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import pages.MainPage;

public class TestClass {

    WebDriver driver;

    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
}

    @Test
    public void testMethod(){
        driver.get("https://www.kraken.com/");

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
