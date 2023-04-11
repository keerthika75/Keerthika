package pageobject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import reusable.BrowserInvocation;
public class SignInPageSteps extends BrowserInvocation {
     public static WebDriver driver;
    public static void signButton(){
        driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
    }
    public static void enterEmail(String emailid){
        driver.findElement(By.name("email")).sendKeys(emailid);
    }
    public static void continueButton(){
        driver.findElement(By.id("continue")).click();
    }
    public static void selectCurrency() {
        WebElement currencyElement = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency"));
        Select aedCurrent = new Select(currencyElement);
        aedCurrent.selectByIndex(5);
    }
    public static void enterPassword(String password){
        driver.findElement(By.name("password")).sendKeys(password);
    }
    public static void signInButton(){
        driver.findElement(By.id("signInSubmit")).click();
    }


}
