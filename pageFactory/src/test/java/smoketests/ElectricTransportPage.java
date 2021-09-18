package smoketests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ElectricTransportPage extends BaseTest{

    private static final String KEYWORD = "Харьков";

    @Test(priority = 1)
    public void searchKharkovShops(){
        getHomePage().electricTransport();
        getElectricTransport().citiesWithStores();
        for (WebElement element: getElectricTransport().listOfShopsInKharkov()) {
            assertTrue(element.getText().contains(KEYWORD));
        }
    }
}
