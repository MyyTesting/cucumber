package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.naming.Name;

public class HomePage
{
    WebDriver driver;
    @FindBy(linkText = "Gift Cards")
    public WebElement Gcardlink;

    @FindBy(linkText = "Log in")
    public WebElement loginlink;

    @FindBy(className = "ico-register")
    public WebElement RegisterLink;

@FindBy(css = "#pollanswers-1")
public WebElement Radiobutton1;

    @FindBy(css ="#vote-poll-1")
    public WebElement Votebutton;

    @FindBy(css ="#block-poll-vote-error-1")
    public WebElement notregerrormessage;
    @FindBy(name ="customerCurrency")
    public WebElement currencyEuro;
    //Select currency=new Select(driver.findElement(By.name("customerCurrency")));
    //        currency.selectByVisibleText("Euro");






    //Actions
    public void Selecteuro()
    {
        Select currency= new Select(currencyEuro);
        currency.selectByVisibleText("Euro");
    }

    public void Radiobutton1Click() {
        Radiobutton1.click();
    }

    public void VotebuttonClick() {
        Votebutton.click();
    }
public boolean user_should_be_able_to_see_homepage()
{
    WebDriverWait wait= new WebDriverWait(driver,20);
    wait.until(ExpectedConditions.visibilityOf(notregerrormessage));

    return notregerrormessage.isDisplayed();
}
public String errormsgprint()
{
    WebDriverWait wait= new WebDriverWait(driver,20);
    wait.until(ExpectedConditions.visibilityOf(notregerrormessage));
   String S = notregerrormessage.getText();
    return S;
}
public void Registerlinkclick()
{
    RegisterLink.click();
}
    public void Gcardlinkclick()
    {
        Gcardlink.click();
    }




    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}