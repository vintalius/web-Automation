package page.objects;

import base.BasicUiScreen;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPoalimPage extends BasicUiScreen {




    @FindBy(xpath = "//i[@class='icon operation-icon icon-ask-for-loan qtr-1']")
     public WebElement bakashatHalvaButton;

    public MainPoalimPage(WebDriver driver) {
        super(driver);
    }
}
