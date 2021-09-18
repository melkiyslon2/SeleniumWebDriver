package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    private static final String SIDE_BAR = "//span[@class='sidebar-item']";
    private static final String APPLE_STORE_BUTTON = "//span[contains(text(),'Apple Store')]";

    private static final String SEARCH_BY_KEYWORD = "//input[@id='input_search']";
    private static final String SEARCH_BUTTON = "//button[@class='button-reset search-btn']";

    private static final String ELECTRIC_SCOOTERS_BUTTON = "//span[contains(text(),'Электротранспорт')]";

    public void slideMenu(){
        driver.findElement(By.xpath(SIDE_BAR)).click();
    }

    public void clickAppleStoreButton(){
        driver.findElement(By.xpath(APPLE_STORE_BUTTON)).click();
    }

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void setSearchByKeyword(final String keyword){
        driver.findElement(By.xpath(SEARCH_BY_KEYWORD)).sendKeys(keyword);
    }

    public void clickSearchButton(){
        driver.findElement(By.xpath(SEARCH_BUTTON)).click();
    }

    public void electricTransport(){
        driver.findElement(By.xpath(ELECTRIC_SCOOTERS_BUTTON)).click();
    }

}
