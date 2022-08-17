package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethod;

public class HomePage extends CommonMethod {

    @FindBy(linkText = "Sign in")
    public WebElement signButton;

    public HomePage(){
        PageFactory.initElements(driver , this);
    }
}
