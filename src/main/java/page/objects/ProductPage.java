package page.objects;

import base.BasicUiScreen;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasicUiScreen {

    @FindBy(id = "our_price_display")
    public WebElement productPrice;
    @FindBy(id = "group_1")
    public WebElement productSize;
    @FindBy(id = "add_to_cart")
    public WebElement addToCart;
    @FindBy(className = "continue btn")
    public WebElement continueToShopping;
    @FindBy(className = "pull-right")
    public WebElement backToSearch;


    public ProductPage(WebDriver driver) {
        super(driver);
    }


}
