package page.objects;

import base.BasicUiScreen;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AshraiBeregaPage extends BasicUiScreen {

    //page 1 of ashraiBerega
    @FindBy(xpath = "//li[@class='active'] //a[@aria-label='שלב נוכחי 1 מתוך 3 פרטי ההלוואה המבוקשת']")
    public WebElement barLevelOne;
    @FindBy(xpath = "//li[@class='active'] //a[@aria-label='שלב נוכחי 2 מתוך 3 הגשת הבקשה']")
    public WebElement barLevelTow;
    @FindBy(xpath = "//li[@class='active'] //a[@aria-label='שלב נוכחי 3 מתוך 3 סיום הגשת הבקשה']")
    public WebElement barLevelThree;

    //page 1 LoanPurpose Options
    @FindBy(xpath = "//button[@id='loan-purpose-61']")
    public WebElement dropDownButton;
    @FindBy(xpath = "//label[contains(text(),'/')]")
    public WebElement dropDownOption1;
    @FindBy(xpath = "//li[3]//label[1]")
    public WebElement dropDownOption2;

    @FindBy(xpath = "//li[4]//label[1]")
    public WebElement dropDownOption3;
    @FindBy(xpath = "//li[5]//label[1]")
    public WebElement dropDownOption4;
    @FindBy(xpath = "//li[6]//label[1]")
    public WebElement dropDownOption5;
    @FindBy(xpath = "//li[7]//label[1]")
    public WebElement dropDownOption6;
    @FindBy(xpath = "//li[8]//label[1]")
    public WebElement dropDownOption7;
    @FindBy(xpath = "//li[9]//label[1]")
    public WebElement dropDownOption8;


    @FindBy(xpath = "//input[@id='loan-amount-21']")
    public WebElement loanAmountInput;
    @FindBy(xpath = "//input[@id='loan-period-21']")
    public  WebElement TimeForPayments;
    @FindBy(xpath = "//form[@name='LoanWizardForm']//button[@class='btn3']")
    public  WebElement NextButton1;
    @FindBy(xpath = "//span[contains(text(),'1,000')]")
    public WebElement limitsMessageOfLoan;
    @FindBy(xpath = "//span[contains(text(),'2 - 84')]")
    public WebElement limitsMessageOfPayTime;
    @FindBy(xpath = "//li[contains(text(),'1000')]")
    public WebElement errorMessageMinMaxLoan;
    @FindBy(xpath = "//li[contains(text(),'84')]")
    public  WebElement errorMessageMinMaxTimePay;
    @FindBy(xpath = "//div[@class='form-errors-original']//li[3]")
    public  WebElement errorMessageLoanPurpose3;
    @FindBy(xpath = "//div[@class='form-errors-original']//li[1]")
    public WebElement errorMessageLoanPurpose1;

    //page 2 of AshraiBerega
    @FindBy(xpath = "//a[@class='icon-save']")
    public WebElement saveButton;
    @FindBy(xpath = "//label[@id='agreement-policy']")
    public WebElement iAgreeTermsButtun;
    @FindBy(xpath = "//ul[2] //li[1] //ul[1] //li[2]")
    public WebElement loanAmountAgreePage;
    @FindBy(xpath = "//ul[2] //li[2] //ul[1] //li[2]")
    public WebElement paymentsTimeAgreePage;
    @FindBy(xpath = "//button[@data-cc='-|LoanWizardForm2|button-submit|confirmLoanRequest' ]")
    public WebElement nextButton2;

    //page 3 of AshraiBerega
    @FindBy(xpath = "//h3[@class='marginBtm20']")
    public WebElement LoanAccepted;



    public AshraiBeregaPage(WebDriver driver) {
        super(driver);
    }
}
