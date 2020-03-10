package page.objects;

import base.BasicUiScreen;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasicUiScreen {

    @FindBy(id = "contact-link")
    public WebElement contactLink;
    @FindBy(id = "htmlcontent_top")
    public WebElement pageHeader;
    @FindBy(className = "search_query")
    public WebElement search;


    public MainPage(WebDriver driver) {
        super(driver);
    }

}
