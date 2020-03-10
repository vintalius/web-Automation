package shared.functions.tests;

import base.Browser;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import page.objects.LobbyAshsraiPage;
import utilities.SeleniumUtils;
import utilities.TestInfoLogger;

import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class AshraiBeregaMethods extends SeleniumUtils {


    String userName = "vw79942";
    String password = "im123456";





    public void PreformLogin()
    {
        setTextInTextField(sharedUi.polimLoginPage.userNameFiled, userName, false, null);
        setTextInTextField(sharedUi.polimLoginPage.passwordFiled, password,false,null);
        clickOnElement(sharedUi.polimLoginPage.loginButton);
    }

    public void EnterToBakashatHalvah()
    {
        clickOnElementBySeconds(sharedUi.mainPoalimPage.bakashatHalvaButton, 10);
    }


    public void EnterToAshraiBerega()
    {
        clickOnElementBySeconds(sharedUi.lobbyAshsraiPage.ashraiBeregaButton,10);
    }


    public void  FillAshraiBeregaPages( int loanPurpose, String loanAmount, String timeForPayments,boolean fillLoanPurpose
            ,boolean checkingErrorsPage1, boolean checkingErrorsPage2) throws InterruptedException, ParseException {
        //Check the moving bar levels (first level)
        ChangeFrame(0);
        Assert.assertTrue(isElementPresented(sharedUi.ashraiBeregaPage.barLevelOne,6));


        //take the limits of loan and payTime from the text in the page
        String[] loanLimits = GetText(sharedUi.ashraiBeregaPage.limitsMessageOfLoan).split(" ");
        Number minLoan = NumberFormat.getNumberInstance(Locale.UK).parse(loanLimits[6]);
        Number maxLoan = NumberFormat.getNumberInstance(Locale.UK).parse(loanLimits[8]);
        String[] payTimeLimits = GetText(sharedUi.ashraiBeregaPage.limitsMessageOfPayTime).split(" ");
        Number minPayTime = NumberFormat.getNumberInstance(Locale.UK).parse(payTimeLimits[6]);
        Number maxPayTime = NumberFormat.getNumberInstance(Locale.UK).parse(payTimeLimits[8]);

        // checking  and filling the page
        if (fillLoanPurpose)
        {
            clickOnElementBySeconds(sharedUi.ashraiBeregaPage.dropDownButton,10);


            switch (loanPurpose)
            {
                case 1:
                    clickOnElement(sharedUi.ashraiBeregaPage.dropDownOption1);
                    break;
                case 2:
                    clickOnElement(sharedUi.ashraiBeregaPage.dropDownOption2);
                    break;
                case 3:
                    clickOnElement(sharedUi.ashraiBeregaPage.dropDownOption3);
                    break;
                case 4:
                    clickOnElement(sharedUi.ashraiBeregaPage.dropDownOption4);
                    break;
                case 5:
                    clickOnElement(sharedUi.ashraiBeregaPage.dropDownOption5);
                    break;
                case 6:
                    clickOnElement(sharedUi.ashraiBeregaPage.dropDownOption6);
                    break;
                case 7:
                    clickOnElement(sharedUi.ashraiBeregaPage.dropDownOption7);
                    break;
                case 8:
                    //you need to scroll down to click this element
                    scrollToElement(sharedUi.ashraiBeregaPage.dropDownOption8);
                    clickOnElement(sharedUi.ashraiBeregaPage.dropDownOption8);
                    break;
            }


        }
        setTextInTextField(sharedUi.ashraiBeregaPage.loanAmountInput, loanAmount, false, null);
        setTextInTextField(sharedUi.ashraiBeregaPage.TimeForPayments, timeForPayments,false, null);
        Thread.sleep(2000);
        clickOnElementBySeconds(sharedUi.ashraiBeregaPage.NextButton1,10);
        Thread.sleep(8000);
        Assert.assertTrue(isElementPresented(sharedUi.ashraiBeregaPage.barLevelTow,2));
        // loan and payTime text to integers and check if to check errors message
        int loanAmountInt = Integer.parseInt(loanAmount);
        int timeForPaymentsInt = Integer.parseInt(timeForPayments);
        if (checkingErrorsPage1)
        {
            CheckingErrorsMessagePage1(loanAmountInt, timeForPaymentsInt, fillLoanPurpose, minLoan.intValue(), minPayTime.intValue() ,maxLoan.intValue(), maxPayTime.intValue());
        }
        if (checkingErrorsPage2)
        {
            CheckingPage2(loanAmount, timeForPayments);
        }
        clickOnElementBySeconds(sharedUi.ashraiBeregaPage.iAgreeTermsButtun,2);
        clickOnElement(sharedUi.ashraiBeregaPage.nextButton2);
        Assert.assertTrue( "the massage of your loan accepted is not appearing",isElementPresented(sharedUi.ashraiBeregaPage.LoanAccepted,2));
        Assert.assertTrue(isElementPresented(sharedUi.ashraiBeregaPage.barLevelThree,1));


    }


    //Check Error Message for loan amount and pay time in page 2 (invalid input)
    public void CheckingErrorsMessagePage1( int loanAmountInt, int timeForPaymentsInt,
                                       boolean fillLoanPurpose, int minLoan, int minPayTime , int maxLoan, int maxPayTime)
    {
        //if to check if i am in the next page
        if (isElementPresented(sharedUi.ashraiBeregaPage.saveButton, 3))
        {
            Assert.assertTrue("Im not in the correct page", !isElementPresented(sharedUi.ashraiBeregaPage.saveButton, 1));
        }
        else
        {
            // if the loan is bigger than the minimum or smaller than the maximum
            if (loanAmountInt > maxLoan || loanAmountInt < minLoan)
            {

                String minMaxLoanErrorMessage = GetText(sharedUi.ashraiBeregaPage.errorMessageMinMaxLoan);
                String text = "אנא בחר ערך גדול או שווה ל- 1000 בשדה סכום ההלוואה המבוקש (קרן) " ;
                Assert.assertTrue("not equals loanValue",minMaxLoanErrorMessage.equals(text));
            }
            if(timeForPaymentsInt > 84)
            {
                String minMaxTimePayErrorMessage = GetText(sharedUi.ashraiBeregaPage.errorMessageMinMaxTimePay);
                String text = "אנא בחר ערך קטן או שווה ל- 84 בשדה תקופת ההלוואה המבוקשת (בחודשים) " ;
                Assert.assertTrue("not equals paymentsTime",minMaxTimePayErrorMessage.equals(text));


            }
            if (!fillLoanPurpose)
            {
                if (isElementPresented(sharedUi.ashraiBeregaPage.errorMessageLoanPurpose1,1))
                {
                        String loanPurposeErrorMessage1 = GetText(sharedUi.ashraiBeregaPage.errorMessageLoanPurpose1);
                        String text = "אנא בחר מטרת ההלוואה " ;
                        Assert.assertTrue("not equals loanValue purpose message",loanPurposeErrorMessage1.equals(text));
                }
                else
                {
                    String loanPurposeErrorMessage3 = GetText(sharedUi.ashraiBeregaPage.errorMessageLoanPurpose3);
                    String text = "אנא בחר מטרת ההלוואה " ;
                    Assert.assertTrue("not equals loanValue purpose message",loanPurposeErrorMessage3.equals(text));
                }
            }
        }
    }

    public void CheckingPage2(String loanAmount,String timeForPayments) throws ParseException {
            if (isElementPresented(sharedUi.ashraiBeregaPage.saveButton, 3))
            {
                //change the comma numbers to normal String numbers
                String[] loanAmountPresented = GetText(sharedUi.ashraiBeregaPage.loanAmountAgreePage).split(" ");
                Number loanAmountPresentedNum = NumberFormat.getNumberInstance(Locale.UK).parse(loanAmountPresented[0]);
                System.out.println(loanAmountPresentedNum.toString());

                //change the comma numbers to normal String numbers
                String[] payTimeAmountPresented = GetText(sharedUi.ashraiBeregaPage.paymentsTimeAgreePage).split(" ");
                Number payTimePresentedNum = NumberFormat.getNumberInstance(Locale.UK).parse(payTimeAmountPresented[0]);
                System.out.println(payTimePresentedNum.toString());

                Assert.assertTrue("The loan amount in page 2 is diffrent from My input",loanAmount.equals(loanAmountPresentedNum.toString()));
                Assert.assertTrue(" the payments time in page 2 is diffrent from my input",timeForPayments.equals(payTimePresentedNum.toString()));

            }
            else
            {
                Assert.assertTrue("Im not in the correct page", isElementPresented(sharedUi.ashraiBeregaPage.saveButton, 1));
            }
        }
}
