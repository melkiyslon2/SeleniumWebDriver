package smoketests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class MoneyRangeTest extends BaseTest {

    private static final String SEARCH_PRICE = "24200";
    private static final String SEARCH_KEYWORD = "Смартфон";

    @Test(priority = 1)
    public void checkIphonesInMoneyRange(){
        getHomePage().slideMenu();
        getHomePage().clickAppleStoreButton();
        getAppleStorePage().openIphonePage();
        getIphonePage().changeMinimumPrice(SEARCH_PRICE);
        getIphonePage().implicityWait(10);
        getIphonePage().showPhoneInRangeButton();
        for (WebElement element: getIphonePage().listOfIphones()) {
            assertTrue(element.getText().contains(SEARCH_KEYWORD));
        }

    }

}
