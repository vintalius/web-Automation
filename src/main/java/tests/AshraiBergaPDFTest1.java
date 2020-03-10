package tests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.testng.annotations.AfterTest;
import org.junit.runners.MethodSorters;
import page.objects.AshraiBeregaPage;
import shared.functions.tests.AshraiBeregaMethods;
import shared.functions.tests.SearchTestMethods;

import java.text.ParseException;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)


public class AshraiBergaPDFTest1 extends AshraiBeregaMethods {

    @Test
    public void Test1() throws InterruptedException, ParseException {
        PreformLogin();
        EnterToBakashatHalvah();
        EnterToAshraiBerega();
        FillAshraiBeregaPages(1,"12000", "12" , true ,false, false);
    }

    @Test
    public void Test2ErrorMessageValidation() throws InterruptedException, ParseException {
        PreformLogin();
        EnterToBakashatHalvah();
        EnterToAshraiBerega();
        FillAshraiBeregaPages(1,"10", "100" ,false,true, false);
    }

    @Test
    public  void Test3ValidationOnPage2() throws ParseException, InterruptedException {
        PreformLogin();
        EnterToBakashatHalvah();
        EnterToAshraiBerega();
        FillAshraiBeregaPages(8,"1000","8",true,false,true);
    }

}
