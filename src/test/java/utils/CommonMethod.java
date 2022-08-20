package utils;
import Steps.PageInitialization;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

public class CommonMethod extends PageInitialization {

   public static WebDriver driver;

    /**
     * this method use for opening browser
     */
  public static void openBrowser(){
      configReader.reader(Constant.CONFIGURATION_PATHFILE);
      switch (configReader.getReaderValue("browser")){
          case "chrome":
              WebDriverManager.chromedriver().setup();
              driver = new ChromeDriver();
              break;
          case "firefox":
              WebDriverManager.firefoxdriver().setup();
              driver = new FirefoxDriver();
              break;

          case "safari":
              WebDriverManager.safaridriver().setup();
              driver = new SafariDriver();
                break;

          default:
            throw new RuntimeException("THIS BROWSER IS NOT SUPPORTED");

      }

      driver.manage().window().maximize();
      driver.get(configReader.getReaderValue("url"));
      driver.manage().timeouts().implicitlyWait(Constant.IMPLICIT_WAIT , TimeUnit.SECONDS);
      initializePage();
  }

    /**
     * this method use for creating object wait few second for clicking
     * @return
     */

  public static WebDriverWait getWait(){
      WebDriverWait wait = new WebDriverWait(driver , Constant.EXPLICIT_WAIT);
      return wait;
  }

    /**
     * this method use for wait clicking
     * @param element
     */
  public static void waitForClick(WebElement element){
      getWait().until(ExpectedConditions.elementToBeClickable(element));

  }

    /**
     * this method use for clicking
     * @param element
     */
  public static void click(WebElement element){
      waitForClick(element);
      element.click();
  }

    /**
     * this method use for sending they value by keys String variable
     * @param element
     * @param keys
     */
  public static void sendkeyz(WebElement element , String keys){
      element.clear();
      element.sendKeys(keys);
  }

    /**
     * this method use for selecting dropDowns
     * @param element
     * @param text
     */
  public static void dropDown(WebElement element ,String text){
      Select select = new Select(element);
      select.selectByVisibleText(text);
  }

    /**
     * this methods use for creating js object
     * @return
     */
  public static JavascriptExecutor getJsExecutor(){
      JavascriptExecutor js = (JavascriptExecutor) driver;
  return js;
  }

    /**
     * this method use for js click
     * @param element
     */
  public static void jsClick(WebElement element){
     getJsExecutor().executeScript("arguments[0].click()",element);
  }

    /**
     * closing browser
     */
  public static void closeBrowser(){
      driver.close();
  }

}
