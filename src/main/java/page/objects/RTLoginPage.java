package page.objects;

import base.BasicUiScreen;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RTLoginPage extends BasicUiScreen {


    @FindBy(xpath = "//input[@placeholder='username']")
    public WebElement userNameFiled;
    @FindBy(xpath = "//input[@placeholder='password']")
    public WebElement passwordFiled;
    @FindBy(xpath = "//button[@class='btn btn-lg btn-blue hvr-push start-button']")
    public WebElement loginButton;


    public RTLoginPage(WebDriver driver) {
        super(driver);
    }
}
