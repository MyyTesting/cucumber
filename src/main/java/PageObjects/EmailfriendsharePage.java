package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmailfriendsharePage {
    WebDriver driver;
    @FindBy(id = "FriendEmail")
    public WebElement Friendemail;
    @FindBy(id = "YourEmailAddress")
    public WebElement Youremail;
    @FindBy(id = "PersonalMessage")
    public WebElement personalMessage;
    @FindBy(id = "add-to-cart-button-44")
    public WebElement Addtocartbutton;
    @FindBy(className = "send-email-a-friend-button")
    public static WebElement emailafriendbutton;


    //Actions
    public void friendemailtext(String S)
    {
        Friendemail.sendKeys(S);
    }
    public void youremailText(String S)
    {
        Youremail.sendKeys(S);
    }
    public void personalmsg(String S)
    {
        personalMessage.sendKeys(S);
    }
    public void sendemailclick()
    {
        emailafriendbutton.click();
    }


    public EmailfriendsharePage(WebDriver driver)
    {
        this.driver= driver;
        PageFactory.initElements(driver,this);

    }
}
