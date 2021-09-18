package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ElectricTransport extends BasePage {

    private static final String LOCATIONS_TO_BUY_BUTTON = "//div[contains(text(),'Где купить Электротранспорт?')]";
    private static final String KHARKOV_SHOPS = "//div[@class='faq__question accord-box open']//ul/li[contains(text(),'Харьков')]";

    public ElectricTransport(WebDriver driver) {
        super(driver);
    }

    public void citiesWithStores(){
        driver.findElement(By.xpath(LOCATIONS_TO_BUY_BUTTON)).click();
    }

    public List<WebElement> listOfShopsInKharkov(){
        return driver.findElements(By.xpath(KHARKOV_SHOPS));
    }

}
