package page.objects;

import base.BasicUiScreen;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AllShirtsPage extends BasicUiScreen {

    @FindBy(id = "selectProductSort")
    public WebElement sort;
    @FindBy(className = "img-responsive")
    public WebElement pageHeader;

    public AllShirtsPage(WebDriver driver) {
        super(driver);
    }

}
