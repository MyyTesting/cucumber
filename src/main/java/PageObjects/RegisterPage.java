package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage
{
    WebDriver driver;
@FindBy (id = "register-button")
public WebElement RegisterButton;
    @FindBy (id = "FirstName-error")
    public WebElement FirstNameError;
    @FindBy (id = "LastName-error")
    public WebElement LastNameError;
    @FindBy (id = "Email-error")
    public WebElement EmailError;
    @FindBy (id = "Password-error")
    public WebElement PasswordError;
    @FindBy (id = "Password-error")
    public WebElement RConfirmPasswordError;

//Actions
public void RegiterButtonclick()
{
    RegisterButton.click();
}
    //Display error message validation

    public boolean Fnamerequired()
    {
        return FirstNameError.isDisplayed();
    }
    public boolean Lnamerequired()
    {
        return LastNameError.isDisplayed();
    }
    public boolean emailrequired()
    {
        return EmailError.isDisplayed();
    }
    public boolean passwordequired()
    {
        return PasswordError.isDisplayed();
    }
    public boolean repasswordrequired()
    {
        return PasswordError.isDisplayed();
    }

// printing error messages to console

    public String firstnameerrordisplay()
    {
        String S = FirstNameError.getText();
        return S;
    }
    public String lastnameerrordisplay()
    {
        String S = LastNameError.getText();
        return S;
    }
    public String emailerrordisplay()
    {
        String S = EmailError.getText();
        return S;
    }
    public String passworderrordisplay()
    {
        String S = RConfirmPasswordError.getText();
        return S;
    }
    public String confirmpassworderrordisplay()
    {
        String S = RConfirmPasswordError.getText();
        return S;
    }


    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
