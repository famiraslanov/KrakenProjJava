package pages;

import browser.Singletone;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainPage {

    //WebDriver driver = new ChromeDriver();

    WebElement pricesButton = getDriver().findElement(By.xpath("//a[@href ='/prices' and text() = 'Prices']"));
    WebElement uniqueAppStoreButton = getDriver().findElement(By.xpath("//a[@href = 'https://kraken.app.link/home-hero-ios']"));


    public void clickPricesButton(){
        pricesButton.click();
    }
    private WebDriver getDriver(){
        return Singletone.getDriver();
    }
}
