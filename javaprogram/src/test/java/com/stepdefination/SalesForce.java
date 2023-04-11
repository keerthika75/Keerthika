package com.stepdefination;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import reusable.BrowserInvocation;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class SalesForce {
    WebDriver driver;
    private WebElement allDropDown;

    @Given("user should navigate to the salesforce application")
    public void navigationSalesForce() throws IOException {
        driver = BrowserInvocation.launchApplication();
    }

    @And("user should clicks to the login button")
    public void clicksLoginButton() {
        driver.findElement(By.id("Login")).click();
    }


    @Then("user get the error message {string}")
    public void userGetTheErrorMessage(String actualErrorMessage) {
        String expectedErrorMessage = driver.findElement(By.id("error")).getText();
        if (actualErrorMessage.equals(expectedErrorMessage)) {
            Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
        } else {
            Assert.fail();
        }
    }

    @When("user should enter the {string} and {string}")
    public void enterTheAnd(String name, String password) {
    }

    @When("user should enter the username{string} and password {string}")
    public void userShouldEnterTheUsernameAndPassword(String Username, String password) {
        driver.findElement(By.name("username")).sendKeys(Username);
        driver.findElement(By.name("pw")).sendKeys(password);
    }

    @Given("user should navigate to the home page and clicks the sign in button")
    public void signInButton() throws IOException {

        driver = BrowserInvocation.launchApplication();
    }

    @Given("user should navigate to home page and sign out the applications")
    public void navigateToHomePage() throws IOException {
        driver = BrowserInvocation.launchApplication();
    }

    @Given("user should navigate to the homepage enter tne username and password")
    public void usernameAndPassword() {
    }

    @Given("user should navigate to the homepage swaglaps applications")
    public void swaglapsApplications() throws IOException {
        driver = BrowserInvocation.launchApplication();
    }

    @When("user should enter the username and password")
    public void nameAndPassword() throws IOException {
        driver.findElement(By.id("user-name")).sendKeys("problem_user");
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        WebElement nameElement = driver.findElement(By.cssSelector("select[class='product_sort_container']"));
        Select selectElement = new Select(nameElement);
        selectElement.selectByValue("hilo");
    }

    @Given("user should navigate to the home page")
    public void homePage() throws IOException {
        driver = BrowserInvocation.launchApplication();

    }

    @When("user select to the currency dropdown and aed value")
    public void userSelectToTheCurrencyDropdownAndAedValue() {
        WebElement currencyElement = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency"));
        Select aedCurrent = new Select(currencyElement);
        aedCurrent.selectByIndex(5);
    }

    @Given("user navigate to the spicejet application")
    public void spicejetApplication() throws IOException {
        driver = BrowserInvocation.launchApplication();
    }

    @When("user clicks the passenger option")
    public void passengerOption() {
        driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
    }

    @Then("user select to the adult option")
    public void adultOption() {
        WebElement adultElement = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT"));
        Select selectAdult = new Select(adultElement);
        selectAdult.selectByValue("5");
    }

    @Then("user select to the child option")
    public void childOption() {
        WebElement childElement = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_CHD"));
        Select selectChild = new Select(childElement);
        selectChild.selectByIndex(3);
    }

    @Given("user navigate to the amazon page")
    public void navigateAmazonPage() throws IOException {
        driver = BrowserInvocation.launchApplication();
    }

    @When("user select to the all option")
    public void allOption() {
        allDropDown = driver.findElement(By.id("searchDropdownBox"));
    }

    @Then("user clicks to the baby option")
    public void babyOption() {
        Select selectBaby = new Select(allDropDown);
        selectBaby.selectByValue("search-alias=baby-products-intl-ship");
    }

    @And("user extract to the all dropdown values")
    public void allDropdownValues() {
        int dropValue = allDropDown.findElements(By.tagName("option")).size();
        List<String> dropElement = new ArrayList<String>();
        for (int i = 0; i < dropValue; i++) {
            dropElement.add(allDropDown.findElements(By.tagName("option")).get(i).getText());
        }
        System.out.println(dropElement);
    }

    @When("user select to the from and chennai")
    public void travellookChennaiDropdown() {
        driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='MAA']")).click();
    }

    @And("user select to the to option")
    public void travellookToOption() {
        driver.findElement(By.xpath("//div[@id='glsControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTNR']//a[@value='BLR']")).click();
    }

    @When("user select to the sign in button")
    public void signIn() {
        driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
    }

    @Then("user clicks to the signout button")
    public void signOutButton() {
        Actions signOutClicks = new Actions(driver);
        signOutClicks.clickAndHold(driver.findElement(By.cssSelector("#nav-item-signout"))).build().perform();
    }

    @And("user clicks to the search box")
    public void searchBox() {
        driver.findElement(By.xpath("//span[text()='Search']")).click();
    }

    @When("user enter the biri text")
    public void biriText() {
        driver.findElement(By.xpath("//input[@class='style__Input-sc-1nogo41-4 cbRUfa']")).sendKeys("biriyani");
    }

    @When("user enter to the password {string}")
    public void enterPassword(String password) {
        driver.findElement(By.id("ap_password")).sendKeys(password);
    }

    @Then("user clicks to the signin button")
    public void signinButton() {

        driver.findElement(By.id("signInSubmit")).click();
    }

    @And("user clicks to the hello sign in option and enter the email id {string} and  clicks to the continue button")
    public void continueButton(String emailid) {
        driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
        // driver.findElement(By.className("nav-action-inner")).click();
        driver.findElement(By.name("email")).sendKeys(emailid);
        driver.findElement(By.id("continue")).click();
    }

    @When("user clicks to the keerthi signin button")
    public void signButton() {
        Actions signOut = new Actions(driver);
        signOut.clickAndHold(driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"))).build().perform();
    }

    @Then("user drag and drop to the signout button")
    public void userSignOutButton() {
        driver.findElement(By.linkText("Sign Out")).click();
    }

    @Then("user select to the target and source frame on drag and drop")
    public void dropHereFrame() {
        WebElement targetFrame = driver.findElement(By.id("draggable"));
        WebElement sourceFrame = driver.findElement(By.id("droppable"));
        Actions clicks = new Actions(driver);
        clicks.dragAndDrop(targetFrame, sourceFrame).build().perform();
    }

    @When("user select to the search button")
    public void selectSearchButton() {
        driver.findElement(By.xpath("//span[@class='Search']")).click();
        driver.findElement(By.cssSelector(".style__Input-sc-1nogo41-4.cbRUfa")).sendKeys("briy");
    }

    @When("user select to the score table")
    public void scoreTable() {
//         List <WebElement> columnOne = driver.findElements(By.xpath("//table[@class='infobox vcard']//tr/th"));
//         List <String> columnOneValue = new ArrayList<String>();
//         for (WebElement e:columnOne) {
//             columnOneValue.add(e.getText());
//         }

        List<WebElement> score = driver.findElements(By.xpath("//div[@class='cb-col cb-col-67 cb-scrd-lft-col html-refresh ng-isolate-scope']"));
    }

    @And("user validate to the title of {string} application")
    public void title(String actualMessage) {
        String titleName = driver.getTitle();
        if (titleName.equals(actualMessage)) {
            Assert.assertEquals(titleName, actualMessage);
        } else {
            Assert.fail();
        }
    }

    @And("user clicks to the calendar icon")
    public void calendarIcon() {
        driver.findElement(By.className("ui-datepicker-trigger")).click();
    }

    @When("user clicks to the from search box")
    public void firstSearchBox() {
        driver.findElement(By.id("flying_from_N")).click();
    }

    @And("user clicks from search box on pass to the value")
    public void fromSearchBox() {
        WebElement button = driver.findElement(By.id("flying_from"));
        button.sendKeys("che");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("flying_from")));
        int i = 0;
        while (i < 5) {
            button.sendKeys(Keys.ARROW_DOWN);
            i++;
        }
        button.sendKeys(Keys.ENTER);
    }

    @Then("user passed value to arrowdown on the below option")
    public void belowOption() {
    }

    @When("user select to the calender icon")
    public void calenderIcon() {
        driver.findElement(By.xpath("//input[@name='date_picker']//following::button[1]")).click();
    }

    @Then("user select to the first table")
    public void firstTable() {
        WebElement table = driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']"));
        table.click();
    }

    @And("user select to the date")
    public void SelectToTheDate() {
        List<WebElement> next = driver.findElements(By.xpath("//a[@data-handler='next']"));
        for (WebElement e : next) {
        }
    }

    @When("user enter the username and password")
    public void login() {
        WebElement userName = driver.findElement(By.name("username"));
        WebElement password = driver.findElement(By.name("pw"));
        userName.sendKeys("anu");
        password.sendKeys("123");
        driver.navigate().refresh();
        try {
            userName.sendKeys("keerthi");
            password.sendKeys("123");
        } catch (StaleElementReferenceException e) {
            userName = driver.findElement(By.name("username"));
            password = driver.findElement(By.name("pw"));
            userName.sendKeys("keerthi");
            password.sendKeys("123");
        }
    }

    @Then("user select to the second table")
    public void SecondTable() {
        //   driver.findElement(By.cssSelector(".ui-datepicker-group.ui-datepicker-group-last")).click();
    }

    @And("user clicks to the next icon and select to the august month and date")
    public void clicksMonthAndDate() {
        WebElement buttonClicks = driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']"));
        int i = 0;
        while (i < 4) {
            buttonClicks = driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']"));
            buttonClicks.click();
            i++;
        }
        driver.findElement(By.xpath("//td[@data-handler='selectDay']/a")).click();
    }

    @When("user counts to the hyperlinks")
    public void hyperlinks() {
        WebElement tools = driver.findElement(By.id("nav_menu-9"));
        int toolsCount = tools.findElements(By.tagName("a")).size();
//        for ( int i = 0; i<toolsCount ; i++){
//        String keyBoard = Keys.chord(Keys.CONTROL,Keys.ENTER);
//            tools.findElements(By.tagName("a")).get(i).sendKeys(keyBoard);
//        }
        Set<String> probValues = driver.getWindowHandles();
        for (String winPro : probValues) {
            String title = driver.switchTo().window(winPro).getTitle();
            System.out.println(title);
            if (title.contains("SpeedLab")) {
                //String key = Keys.chord(Keys.CONTROL,Keys.ENTER);
                driver.findElement(By.xpath("//a[@class='btn-secondary-white btn-md']")).click();
                break;
            }
        }
    }

    @Then("user counts to the company frame")
    public void usercompanyFrame() {
        WebElement companyFrame = driver.findElement(By.id("nav_menu-5"));
        companyFrame.findElements(By.tagName("a"));
        Set<String> companyCounts = driver.getWindowHandles();
        for (String winPro : companyCounts) {
            String companyTitle = driver.switchTo().window(winPro).getTitle();
            System.out.println(companyTitle);
        }
        driver.switchTo().defaultContent();
    }

    @When("user select the tables")
    public void theTables() {
        WebElement table = driver.findElement(By.xpath("//table[@class='infobox vcard']"));
        int count = table.findElements(By.tagName("/li")).size();
        for (int i = 0; i < count; i++) {

        }
    }
}






































