package page.objects;

import base.BasicUiScreen;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PolimLoginPage extends BasicUiScreen {

    @FindBy(xpath = "//input[@id='userCode']")
    public WebElement userNameFiled;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordFiled;
    @FindBy(xpath = "//button[@class='red-coloring-btn login-btn']")
    public WebElement loginButton;


    public PolimLoginPage(WebDriver driver) {
        super(driver);
    }
}
