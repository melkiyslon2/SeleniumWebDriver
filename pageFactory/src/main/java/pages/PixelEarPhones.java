package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PixelEarPhones extends BasePage {

    private static final String COLOR_CHOOSE_SELECTOR = "//a[@title='Наушники Google Pixel Buds 2 White']";
    private static final String ADD_EAR_PHONES_TO_CART = "//a[contains(@data-ecomm-cart,'Наушники Google Pixel Buds 2 White')]";
    private static final String CONTINUE_SHOPPING_BUTTON = "//a[contains(text(),'Продолжить покупки')]";
    private static final String CHECK_COLOR = "//span[@class='name']";

    public PixelEarPhones(WebDriver driver) {
        super(driver);
    }

    public void changeColorOfEarPhones(){
        driver.findElement(By.xpath(COLOR_CHOOSE_SELECTOR)).click();
    }

    public void addToCartButton(){
        driver.findElement(By.xpath(ADD_EAR_PHONES_TO_CART)).click();
    }

    public void continueShopping(){
        driver.findElement(By.xpath(CONTINUE_SHOPPING_BUTTON)).click();
    }

    public String getColor(){
        return driver.findElement(By.xpath(CHECK_COLOR)).getText();
    }

}
