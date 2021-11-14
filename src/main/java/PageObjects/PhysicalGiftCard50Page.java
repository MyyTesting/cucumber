package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PhysicalGiftCard50Page
{
    WebDriver driver;
    @FindBy(id = "giftcard_44_RecipientName")
    public WebElement Recipientname;
        @FindBy(id = "giftcard_44_SenderName")
    public WebElement Yourname;
        @FindBy(id = "giftcard_44_Message")
    public WebElement Message;
    @FindBy(id = "add-to-cart-button-44")
    public WebElement Addtocartbutton;
    @FindBy(className = "email-a-friend-button")
    public static WebElement emailafriendbutton;
    @FindBy(className = "content")
    public WebElement Addedtocartsuccessmsg;
    //shopping cart

    //Actions
    public void RecipientnameText(String S)
    {
        Recipientname.sendKeys(S);
    }
   public void SendernameText(String S)
    {
        Yourname.sendKeys(S);
    }
    public void GiftMessage(String S)
    {
        Message.sendKeys(S);
    }
    public void Addtocartclick()
    {
        Addtocartbutton.click();
    }
    public boolean verifyaddedtocartmsg()
    {
        return Addedtocartsuccessmsg.isDisplayed();
    }
    public void Emailafriendclick(){ emailafriendbutton.click();}

    public PhysicalGiftCard50Page(WebDriver driver)
    {
        this.driver= driver;
        PageFactory.initElements(driver,this);

    }
}
