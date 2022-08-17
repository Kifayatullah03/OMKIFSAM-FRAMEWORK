package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethod;

public class RegisterPage extends CommonMethod {

    @FindBy(id = "id_gender1")
    public WebElement genderCheckBox;

    @FindBy(id = "customer_firstname")
    public WebElement nameSection;

    @FindBy(id = "customer_lastname")
    public WebElement lastNameSection;

    @FindBy(id = "passwd")
    public WebElement passwordSection;

    @FindBy(xpath = "//select[@id= 'days']")
    public WebElement days;

    @FindBy(id = "months")
    public WebElement month;

    @FindBy(id = "years")
    public WebElement year;

    @FindBy(xpath = "//input[@id = 'newsletter']")
    public WebElement checkBoxNewSeller;

    @FindBy(id = "firstname")
    public WebElement firstname;

    @FindBy(id = "lastname")
    public WebElement lastName;

    @FindBy(id = "company")
    public WebElement companySection;

    @FindBy(id = "address1")
    public WebElement address1Secion;

    @FindBy(id = "address2")
    public WebElement address2Section;

    @FindBy(id = "city")
    public WebElement citySection;

    @FindBy(id = "id_state")
    public WebElement stateSelectSection;

    @FindBy(id = "postcode")
    public WebElement zipSection;

    @FindBy(id = "id_country")
    public WebElement countrySection;

    @FindBy(xpath = "//textarea[@id = 'other']")
    public WebElement infoSection;

    @FindBy(id = "phone")
    public WebElement homePhoneSection;

    @FindBy(id = "phone_mobile")
    public WebElement phoneSection;

    @FindBy(id = "alias")
    public WebElement addressAliasSection;

    @FindBy(id = "submitAccount")
    public WebElement registerButtonSection;
    public RegisterPage(){
        PageFactory.initElements(driver , this);
    }
}