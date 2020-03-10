package page.objects;

import base.BasicUiScreen;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LobbyAshsraiPage extends BasicUiScreen {


    @FindBy(xpath = "//i[@class='icon icon-input arrow']")
    public WebElement ashraiBeregaButton;


    public LobbyAshsraiPage(WebDriver driver) {
        super(driver);
    }
}
