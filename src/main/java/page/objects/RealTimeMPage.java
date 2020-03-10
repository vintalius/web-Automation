package page.objects;

import base.BasicUiScreen;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RealTimeMPage extends BasicUiScreen {




    @FindBy(xpath = "//body[@class='rtl home page-template page-template-template-blank-4 page-template-template-blank-4-php page page-id-2260 x-renew x-navbar-fixed-top-active x-full-width-layout-active x-full-width-active x-page-title-disabled responsive-menu-slide-left elementor-default x-v4_6_4 x-child-theme-active cornerstone-v2_1_7 su-other-shortcodes-loaded enable-toolbar-RTL trigger-position-left quick-links-position-center trigger-size-medium trigger-color-blue']/div[@id='top']/div[@class='x-main full']/article[@id='post-2260']/div[@class='entry-content content']/div[@id='top']/div[@class='x-main full']/article[@id='post-2260']/div[@class='entry-content content']/div[@id='Menu']/div[@id='MenuLeft']/a[1]")
    public WebElement loginLink;

    public RealTimeMPage(WebDriver driver) {
        super(driver);
    }
}
