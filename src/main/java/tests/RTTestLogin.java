package tests;

import org.junit.Test;
import shared.functions.tests.RTMethods;

public class RTTestLogin extends RTMethods {

    @Test
    public void Login()
    {
        ClickOnLoginLInk();
        ChangeTab();
        PreformLogin();
    }
}
