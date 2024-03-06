package pages;

import browser.Singletone;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainPage {

    WebDriver driver = new ChromeDriver();

    Singletone.getDriver();
    WebElement pricesButton = driver.findElement(By.xpath("//a[@href ='/prices' and text() = 'Prices']"));
    WebElement uniqueAppStoreButton = driver.findElement(By.xpath("//a[@href = 'https://kraken.app.link/home-hero-ios']"));


    public void clickPricesButton(){
        pricesButton.click();
    }
}
