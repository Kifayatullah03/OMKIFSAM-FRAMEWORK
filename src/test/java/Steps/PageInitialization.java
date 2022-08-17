package Steps;

import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;

public class PageInitialization {

    public static  LoginPage login;
    public static HomePage home;
    public static  RegisterPage registrationPage;

    public static void initializePage(){
        login = new LoginPage();
        home =new HomePage();
        registrationPage = new RegisterPage();
    }

}