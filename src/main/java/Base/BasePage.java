package Base;

import PageObjects.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage
{
    public static WebDriver driver;
    public static HomePage homepage;
    public static RegisterPage registerPage;
    public static GiftCardsPage giftcardspage;
    public static VirtualGiftCard25Page virtualGiftCard25Page;
    public static PhysicalGiftCard50Page physicalGiftCard50Page;
    public static EmailfriendsharePage emailfriendshare;


    @Before
    public  static void setup()
    {

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        //driver.navigate().to();
        driver.manage().window().maximize();

        homepage = new HomePage(driver);
registerPage= new RegisterPage(driver);
giftcardspage=new GiftCardsPage(driver);
virtualGiftCard25Page= new VirtualGiftCard25Page(driver);
        physicalGiftCard50Page= new PhysicalGiftCard50Page(driver);
        emailfriendshare=new EmailfriendsharePage(driver);


    }


  @After
    public static void Quit(Scenario scenario)
    {
        if(scenario.isFailed()) {
            final byte[] screenshot=((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png", "screenshot");
        }

        driver.quit();
    }

    public static void navigatetoUrl(String url)
    {
        driver.navigate().to(url);
    }
    public static String getpagetitle()
    {
        return driver.getTitle();

            }
}
