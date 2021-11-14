package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VirtualGiftCard25Page
{
    WebDriver driver;
    @FindBy(id = "giftcard_43_RecipientName")
    public WebElement Recipientname;
    @FindBy(id = "giftcard_43_RecipientEmail")
    public WebElement RecipientEmail;
    @FindBy(id = "giftcard_43_SenderName")
    public WebElement Sendername;
    @FindBy(id = "giftcard_43_SenderEmail")
    public WebElement SenderEmail;
    @FindBy(id = "giftcard_43_Message")
    public WebElement Message;
    @FindBy(id = "add-to-cart-button-43")
    public WebElement Addtocartbutton;
    @FindBy(className = "content")
    public WebElement Addedtocartsuccessmsg;
    //shopping cart

    //Actions
    public void RecipientnameText(String S)
    {
        Recipientname.sendKeys(S);
    }
    public void RecipientEmailText(String S)
    {
        RecipientEmail.sendKeys(S);
    }
    public void SendernameText(String S)
    {
        Sendername.sendKeys(S);
    }
    public void SenderEmailText(String S)
    {
        SenderEmail.sendKeys(S);
    }
    public void GiftMessage(String S)
    {
        Message.sendKeys(S);
    }
    public void Addtocartclick()
    {
        Addtocartbutton.click();
    }
    public String verifyaddedtocartmsg()
    {
        WebDriverWait wait= new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOf(Addedtocartsuccessmsg));
        return Addedtocartsuccessmsg.getText();
    }

    public VirtualGiftCard25Page(WebDriver driver)
    {
        this.driver= driver;
        PageFactory.initElements(driver,this);

    }
}
