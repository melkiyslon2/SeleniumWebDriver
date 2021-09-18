package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AppleStorePage extends BasePage{

    public static final String IPHONE_BUTTON = "//div[@class='brand-box__title']//a[contains(text(),'iPhone')]";

    public void openIphonePage(){
        driver.findElement(By.xpath(IPHONE_BUTTON)).click();
    }

    public AppleStorePage(WebDriver driver) {
        super(driver);
    }
}
