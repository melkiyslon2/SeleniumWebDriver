package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class IphonePage extends BasePage{

    private static final String PRICE_CHANGE_INPUT = "//input[contains(@class,'form-control-min')]";
    private static final String SHOW_PHONE_IN_RANGE_BUTTON = "//div[contains(@class,'open-filter-tooltip')]//a[@class='filter-tooltip js_filters_accept']";
    private static final String CHECK_IPHONE_NAMES = "//div[@class='prod-cart__descr']";

    public IphonePage(WebDriver driver) {
        super(driver);
    }

    public void changeMinimumPrice(final String searchPrice){
        driver.findElement(By.xpath(PRICE_CHANGE_INPUT)).sendKeys(searchPrice, Keys.ENTER);
    }

    public void showPhoneInRangeButton(){
        driver.findElement(By.xpath(SHOW_PHONE_IN_RANGE_BUTTON)).click();
    }

    public List<WebElement> listOfIphones(){
        return driver.findElements(By.xpath(CHECK_IPHONE_NAMES));

    }

}
