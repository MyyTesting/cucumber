package steps;

import Base.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StepDefinitions
{




    public static class Stepdefinitions

    {
        String homepageExpectedtitle="nopCommerce demo store";
        String homepageActualtitle;
        String registerpageExpectedtitle="nopCommerce demo store. Register";
        String registerpageActualtitle;
        String GiftCardspageExpectedtitle = "nopCommerce demo store. Gift Cards";
        String GiftCardspageActualtitle;
        String gcard50expectedtitle="nopCommerce demo store. $50 Physical Gift Card";
        String gcard50actualtitle;
        String gcard25expectedtitle="nopCommerce demo store. $25 Physical Gift Card";
        String gcard25actualtitle;
        String gift25successmsgActual;

        @Given("Url is loaded {string}")
        public void url_is_loaded(String url) {
            BasePage.navigatetoUrl(url);
        }

        @Then("User should be able to see Homepage")
        public void user_should_be_able_to_see_homepage() {
            homepageActualtitle=BasePage.getpagetitle();
            Assertions.assertEquals(homepageExpectedtitle,homepageActualtitle);
        }

        @When("User selects any radio button under Community Poll")
        public void user_selects_any_radio_button_under_community_poll() {
            BasePage.homepage.Radiobutton1Click();

        }

        @When("User clicks on Vote button")
        public void user_clicks_on_vote_button() {
            BasePage.homepage.VotebuttonClick();
        }

        @Then("Error message should appear")
        public void error_message_should_appear() {

            BasePage.homepage.user_should_be_able_to_see_homepage();
        }
        @Then("Print the error message to console")
        public void print_the_error_message_to_console() {

            String s = BasePage.homepage.errormsgprint();
            System.out.println(s);

        }
        //-----------------------------------------------------


        @When("User clicks on Register link")
        public void user_clicks_on_register_link() {
            BasePage.homepage.Registerlinkclick();
        }

        @Then("User should be able to see Registerpage")
        public void user_should_be_able_to_see_registerpage()
        {
            registerpageActualtitle=BasePage.getpagetitle();
                //Assertions.assertEquals(registerpageExpectedtitle,registerpageActualtitle);

        }
        @When("User clicks on Register button")
        public void user_clicks_on_register_button() {
         BasePage.registerPage.RegiterButtonclick();
        }
        @Then("Error message should appear for Firstname")
        public void error_message_should_appear_for_firstname() {
            BasePage.registerPage.Fnamerequired();
        }
        @Then("Error message should appear for Lastname")
        public void error_message_should_appear_for_lastname() {
            BasePage.registerPage.Lnamerequired();
        }
        @Then("Error message should appear for Email")
        public void error_message_should_appear_for_email() {
            BasePage.registerPage.emailrequired();
        }
        @Then("Error message should appear for Password")
        public void error_message_should_appear_for_password() {
            BasePage.registerPage.passwordequired();
        }
        @Then("Error message should appear to ConfirmPassword")
        public void error_message_should_appear_to_confirm_password() {
            BasePage.registerPage.passwordequired();
        }
        @Then("Print the Firstname error message to console")
        public void print_the_firstname_error_message_to_console() {
            String s = BasePage.registerPage.firstnameerrordisplay() ;
            System.out.println(s);
        }
        @Then("Print the lastname error message to console")
        public void print_the_lastname_error_message_to_console() {
            String s = BasePage.registerPage.lastnameerrordisplay() ;
            System.out.println(s);;
        }
        @Then("Print the Email error message to console")
        public void print_the_email_error_message_to_console() {
            String s = BasePage.registerPage.emailerrordisplay() ;
            System.out.println(s);
        }
        @Then("Print the Password error message to console")
        public void print_the_password_error_message_to_console() {
            String s = BasePage.registerPage.confirmpassworderrordisplay() ;
            System.out.println(s);
        }
        @Then("Print the ConfirmPassword error message to console")
        public void print_the_confirm_password_error_message_to_console() {
            String s = BasePage.registerPage.confirmpassworderrordisplay() ;
            System.out.println(s);
        }

//-------------------------------------------shopping
@When("User clicks on GiftCard link")
public void user_clicks_on_gift_card_link() {
    BasePage.homepage.Gcardlinkclick();
}

        @Then("User should be able to see Giftcards page")
        public void user_should_be_able_to_see_giftcards_page() {
            GiftCardspageActualtitle=BasePage.getpagetitle();
        }

        @Then("User changes Currency to Euro")
        public void user_changes_currency_to_euro() {
            BasePage.homepage.Selecteuro();
        }

        @When("User clicks on 25Virtual Giftcard")
        public void user_clicks_on_25virtual_giftcard() {
            BasePage.giftcardspage.Vgiftcardlink25();
        }

        @Then("User should be navigated to 25Virtual Giftcard page")
        public void user_should_be_navigated_to_25virtual_giftcard_page() {
            gcard25actualtitle=BasePage.getpagetitle();

        }

       @When("User enters RecipientName RecipientsEmail SenderName SenderEmail Message")
        public void user_enters_recipient_name_recipients_email_sender_name_sender_email_message(io.cucumber.datatable.DataTable dataTable) {
            BasePage.virtualGiftCard25Page.RecipientnameText(dataTable.cell(1,0) );
            BasePage.virtualGiftCard25Page.RecipientEmailText(dataTable.cell(1,1));
            BasePage.virtualGiftCard25Page.SendernameText(dataTable.cell(1,2));
            BasePage.virtualGiftCard25Page.SenderEmailText(dataTable.cell(1,3));




        }


        @When("User clicks on Addtocart button")
        public void user_clicks_on_addtocart_button() {
            BasePage.virtualGiftCard25Page.Addtocartclick();
        }

        @Then("User should be able to see message {string}")
        public void user_should_be_able_to_see_message(String Sucessmsg) {

            gift25successmsgActual= BasePage.virtualGiftCard25Page.verifyaddedtocartmsg();
            Assertions.assertEquals(gift25successmsgActual,Sucessmsg);

        }
        //--------------------------------


       @When("User clicks on FifttyPhysical GiftCard")
       public void userClicksOnFifttyPhysicalGiftCard() {
           BasePage.giftcardspage.Vgiftcardlink50();
       }

        @Then("User should be navigated to 50Virtual Giftcard page")
        public void user_should_be_navigated_to_50virtual_giftcard_page() {
            gcard50actualtitle=BasePage.getpagetitle();

        }

        @When("User enters RecipientName SenderName Message")
        public void user_enters_recipient_name_sender_name_message(io.cucumber.datatable.DataTable dataTable) {
            BasePage.physicalGiftCard50Page.RecipientnameText(dataTable.cell(1,0));
            BasePage.physicalGiftCard50Page.SendernameText(dataTable.cell(1,1));
            BasePage.physicalGiftCard50Page.GiftMessage (dataTable.cell(1,2));
        }

        @When("User clicks on fiftyAddtocart button")
        public void userClicksOnFiftyAddtocartButton() {
            BasePage.physicalGiftCard50Page.Addtocartclick();
        }

        //-------------

        @When("User clicks on Email friend button")
        public void user_clicks_on_email_friend_button() {
            BasePage.physicalGiftCard50Page.Emailafriendclick();
        }

        @When("User enters {string}")
        public void userEnters(String Friendemail) {
            BasePage.emailfriendshare.friendemailtext(Friendemail);
        }
        @When("User enters Femail {string}")
        public void user_enters_femail(String Frdemail) {
            BasePage.emailfriendshare.friendemailtext(Frdemail);
        }

        @When("User enters email {string}")
        public void user_enters_email(String sendname) {
            BasePage.emailfriendshare.youremailText(sendname);
        }

        @When("User enters Pmessage {string}")
        public void user_enters_pmessage(String pmsg)
        {
            BasePage.emailfriendshare.personalmsg(pmsg);
        }





        @When("User clicks on SendEmail button")
        public void user_clicks_on_send_email_button() {
           BasePage.emailfriendshare.sendemailclick();
        }



    }

}
