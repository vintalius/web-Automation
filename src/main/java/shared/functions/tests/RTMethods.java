package shared.functions.tests;

import utilities.SeleniumUtils;

public class RTMethods extends SeleniumUtils {

    String userName = "vintalius@gmail.com";
    String password = "313851453";

    public void ClickOnLoginLInk()
    {
        clickOnElementBySeconds(sharedUi.realTimeMPage.loginLink, 10);
    }

    public void ChangeTab()
    {
        FindsLastTab();
    }

    public void PreformLogin()
    {
        setTextInTextField(sharedUi.rtLoginPage.userNameFiled, userName, false, null);
        setTextInTextField(sharedUi.rtLoginPage.passwordFiled, password,false,null);
        clickOnElement(sharedUi.rtLoginPage.loginButton);
    }


}
