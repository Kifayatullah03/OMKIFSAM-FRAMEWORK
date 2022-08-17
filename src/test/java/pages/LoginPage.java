package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethod;

public class LoginPage extends CommonMethod {
    @FindBy(xpath = "//input[@id = 'email_create']" )
    public WebElement emailSection;

    @FindBy(xpath = "//button[@id = 'SubmitCreate']")
    public WebElement createButton;

    public LoginPage(){
        PageFactory.initElements(driver , this);
    }
}
