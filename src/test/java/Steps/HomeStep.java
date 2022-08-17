package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethod;

public class HomeStep extends CommonMethod {



    @Given("user navigate to url automationPractice application")
    public void user_navigate_to_url_automation_practice_application() {
        openBrowser();
    }
    @When("user click on sign in link button")
    public void user_click_on_sign_in_link_button() {
        click(home.signButton);
    }
    @When("user enter email address in {string} section")
    public void user_enter_email_address_in_section(String string) {
        sendkeyz(login.emailSection, "kfiayat.amini0@gmail.com");
    }

    @When("user click on create Account button")
    public void user_click_on_create_account_button() {
        click(login.createButton);
    }
    @When("user enter the personal information ,Address adn contact info")
    public void user_enter_the_personal_information_address_adn_contact_info() {

        click(registrationPage.genderCheckBox);
        sendkeyz(registrationPage.nameSection , "Kifayatullah");
        sendkeyz(registrationPage.lastNameSection , "amini");
        sendkeyz(registrationPage.passwordSection,"amini1111222#@@");
        dropDown(registrationPage.days, "2");
        dropDown(registrationPage.month ,"4");
        dropDown(registrationPage.year, "July");
        jsClick(registrationPage.checkBoxNewSeller);
        sendkeyz(registrationPage.firstname , "kifayatullah" );
        sendkeyz(registrationPage.lastName, "amini");
        sendkeyz(registrationPage.companySection ,"oks");
        sendkeyz(registrationPage.address1Secion , "bayArea peshkochi lala sameer shan");
        sendkeyz(registrationPage.address2Section , "nazdik khana lala omid shan");
        sendkeyz(registrationPage.citySection ,"bayArea");
        dropDown(registrationPage.stateSelectSection , "California");
        sendkeyz(registrationPage.zipSection , "25000");
        dropDown(registrationPage.countrySection, "United States");
        sendkeyz(registrationPage.infoSection , "just for working practice");
        sendkeyz(registrationPage.homePhoneSection , "00152435345");
        sendkeyz(registrationPage.phoneSection , "0013432423432");
        sendkeyz(registrationPage.addressAliasSection,"non of your business");
    }
    @When("user click on register button")
    public void user_click_on_register_button() {
        click(registrationPage.registerButtonSection);
    }
    @Then("user  Validate that user is created.")
    public void user_validate_that_user_is_created() {
        System.out.println("successfully created");
        closeBrowser();
    }


}
