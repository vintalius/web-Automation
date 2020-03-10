package shared.functions.tests;

import general.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.SeleniumUtils;

import java.util.List;

public class SearchTestMethods extends SeleniumUtils {

    private List<WebElement> products;

    public void searchProduct() {


        setTextInTextField(sharedUi.mainPage.search, "Printed Chiffon Dress", true, Constants.ENTER);

    }

    public void chooseProduct() {

        products = getWebElementsList(By.className("product-name"));
        System.out.println(products.size());

        if (products.size() > 1) {

            clickOnElementWithJS((products.get(1)));
            clickOnElementWithJS(sharedUi.productPage.productPrice);
            selectOption("M", sharedUi.productPage.productSize);
            clickOnElementWithJS(sharedUi.productPage.addToCart);
        } else
            log.debug("Not Product For Your Search");
    }

}
