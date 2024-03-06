package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Singletone {

    private static WebDriver driver;
    public static WebDriver getDriver(){
        if (driver == null)
            return new ChromeDriver();
        else
            return driver;

    }
}
