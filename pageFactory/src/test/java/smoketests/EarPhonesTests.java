package smoketests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


import static org.testng.Assert.assertTrue;

public class EarPhonesTests extends BaseTest {

    private static final String KEYWORD = "Pixel";
    private static final String LOCATOR = "js_cart";
    private static final String VERIFICATION_WORD = "Google Pixel Buds";

    @Test(priority = 1)
    public void searchIphoneInMoneyRange(){
        getHomePage().setSearchByKeyword(KEYWORD);
        getHomePage().clickSearchButton();
        getPixelEarPhone().changeColorOfEarPhones();
        getPixelEarPhone().implicityWait(10);
        getPixelEarPhone().addToCartButton();
        getPixelEarPhone().waitTillCartOpens(30,getAddToCart());
        getPixelEarPhone().continueShopping();
        assertTrue(getPixelEarPhone().getColor().contains(VERIFICATION_WORD));
    }

    public By getAddToCart(){
        return By.id(LOCATOR);
    }

}
