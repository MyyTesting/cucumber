package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GiftCardsPage
{
    WebDriver driver;
    @FindBy(linkText = "$25 Virtual Gift Card")
    public WebElement VirtualGiftCard25;
    @FindBy(linkText = "$50 Physical Gift Card")
    public WebElement VirtualGiftCard50;
    //actions
    public void Vgiftcardlink25()
    {
        VirtualGiftCard25.click();
    }
    public void Vgiftcardlink50()
{
    VirtualGiftCard50.click();
}


    public GiftCardsPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
