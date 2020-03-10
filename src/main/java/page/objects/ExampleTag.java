package page.objects;

import base.BasicUiScreen;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ExampleTag extends BasicUiScreen {

    @FindBy(id = "selectProductSort")
    public WebElement sort;

    public ExampleTag(WebDriver driver) {
        super(driver);
    }
}
