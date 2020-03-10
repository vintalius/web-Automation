package base;

import org.openqa.selenium.WebDriver;
import page.objects.*;


public class SharedUi {

    public MainPage mainPage;
    public AllShirtsPage allShirtsPage;
    public ProductPage productPage;
    public ExampleTag exampleTag;
    public RealTimeMPage realTimeMPage;
    public RTLoginPage rtLoginPage;
    public PolimLoginPage polimLoginPage;
    public MainPoalimPage mainPoalimPage;
    public LobbyAshsraiPage lobbyAshsraiPage;
    public AshraiBeregaPage ashraiBeregaPage;

    public SharedUi(WebDriver driver) {
        this.mainPage = new MainPage(driver);
        this.allShirtsPage = new AllShirtsPage(driver);
        this.productPage = new ProductPage(driver);
        this.exampleTag = new ExampleTag(driver);
        this.realTimeMPage = new RealTimeMPage(driver);
        this.rtLoginPage = new RTLoginPage(driver);
        this.polimLoginPage = new PolimLoginPage(driver);
        this.mainPoalimPage = new MainPoalimPage(driver);
        this.lobbyAshsraiPage = new LobbyAshsraiPage(driver);
        this.ashraiBeregaPage = new AshraiBeregaPage(driver);
    }
}
