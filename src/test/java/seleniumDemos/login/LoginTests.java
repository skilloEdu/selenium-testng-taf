package seleniumDemos.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTests {
    public static final String BASE_URL = "http://training.skillo-bg.com:4300/";
    public static final String HOME_PAGE = BASE_URL+"posts/all";
    public static final String LOGIN_PAGE = BASE_URL+"users/login";

    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));

    @BeforeMethod
    public void initBrowser() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void verifyUserCanNavigateToLoginPage () throws InterruptedException {

        driver.get(BASE_URL);
        //=============================================================
        //>>>>>>>>>>>>>>>>>  1  N A V I G A T I O N TO      L O G I N      P A G E
        //Step 1 Provide verification that the user is landing the home page of ISkilo
        System.out.println("Step: 1 *** The user has landing on ISkilo home page");

        System.out.println("Step: 1.1. *** Verify home page title when user is not logged in");
        String actualPageTitle = driver.getTitle();


        System.out.println("Step: 1.2. -> Verify navigation login button is presented on home page");
        WebElement navLoginButton = driver.findElement(By.cssSelector("#nav-link-login"));
        boolean isNavLoginButtonShown = navLoginButton.isDisplayed();
        Assert.assertTrue(isNavLoginButtonShown);

        System.out.println("Step: 2 *** The user navigates to login page via navigation login button click");
        navLoginButton.click();

        //=============================================================
        //>>>>>>>>>>>>>>>>>  2  L O G I N   F U N C T I O N A L I T I E S
        //.................  2.1.  L O G I N   P A G E   L A Y O U T

        System.out.println("Step: 3 *** The user verifies login form layout");
        System.out.println("Step: 3.1. -> Verify login form header is per requirements ");
        String expectedLoginFormHeaderText = "Sign in";
        WebElement loginFormHeader = driver.findElement(By.cssSelector("p.h4"));
        String actualLoginFormHeaderText = loginFormHeader.getText();
        Assert.assertEquals(actualLoginFormHeaderText, expectedLoginFormHeaderText);
        System.out.println("Step: 3.1. # THere is a match actual login form header matches the criteria ");
        //.........................................................................

        System.out.println("Step: 3.2. -> Verify username input field placeholder is per requirements ");
        String expectedUserNameInputFieldPlaceHolder = "Username or email";
        WebElement userNameInputField = driver.findElement(By.cssSelector("#defaultLoginFormUsername"));
        String actualUserNameInputFieldPlaceHolder = userNameInputField.getAttribute("placeholder");

        Assert.assertEquals(actualUserNameInputFieldPlaceHolder,
                            expectedUserNameInputFieldPlaceHolder);

        System.out.println("The is a match between actual username input field placeholder "+actualUserNameInputFieldPlaceHolder + " :: " +expectedUserNameInputFieldPlaceHolder);

        //.........................................................................
        System.out.println("Step: 3.3. -> Verify password input field placeholder is per requirements ");
        String expectedPasswordInputFieldPlaceHolderText  = "Password";
        WebElement passwordInputField = driver.findElement(By.cssSelector("#defaultLoginFormPassword"));
        String actualPasswordInputFieldPlaceHolderText = passwordInputField.getAttribute("placeholder");

        Assert.assertEquals(actualPasswordInputFieldPlaceHolderText,
                              expectedPasswordInputFieldPlaceHolderText );
        System.out.println("The is a match between actual password input field placeholder "+actualPasswordInputFieldPlaceHolderText + " :: " +expectedPasswordInputFieldPlaceHolderText);

        //.........................................................................
        System.out.println("Step: 3.4. -> Remember me checkbox text is per requirements ");
        String expectedRememberMeLabelText = "Remember me";
        WebElement rememberMeLabelText = driver.findElement(By.cssSelector(".remember-me span"));
        String actualRememberMeLabelText = rememberMeLabelText.getText();

        Assert.assertEquals(actualRememberMeLabelText,
                            expectedRememberMeLabelText);

        consoleLoggerForAMatch(actualRememberMeLabelText,expectedRememberMeLabelText);

        //.........................................................................
        System.out.println("Step: 3.5. -> Verify remember me check box is shown is per requirements ");
        WebElement rememberMeCheckBox = driver.findElement(By.xpath("//div[contains(@class,'remember-me')]/input"));

        boolean isRememberMeRadioCheckBox = rememberMeCheckBox.isDisplayed();
        Assert.assertTrue(isRememberMeRadioCheckBox);

        //.........................................................................
        System.out.println("Step: 3.6. -> Not a member? text is presented as per requirements ");
        String  expectedLoginPageRegistrationPrompText = "Not a member?";
        WebElement registrationPorptLabelText = driver.findElement(By.xpath("//span[contains(.,'Not a member?')]"));

        String actualRegistrationPorptLabelText = registrationPorptLabelText.getText();

        Assert.assertEquals(actualRegistrationPorptLabelText,
                            expectedLoginPageRegistrationPrompText);

        consoleLoggerForAMatch(actualRegistrationPorptLabelText,expectedLoginPageRegistrationPrompText);

        //.........................................................................
        System.out.println("Step: 3.7. -> Registration link is presented as per requirements ");
        String expectedRegistrationLinkLabelText  = "Register";

        WebElement registrationLink = driver.findElement(By.xpath("//a[contains(@href,'/users/register')]"));
        String actualRegistrationLinkLabelText = registrationLink.getText();

        Assert.assertEquals(actualRegistrationLinkLabelText,
                            expectedRegistrationLinkLabelText);

        consoleLoggerForAMatch(actualRegistrationLinkLabelText,expectedRegistrationLinkLabelText);

        //=============================================================
        //>>>>>>>>>>>>>>>>>  2  L O G I N   F U N C T I O N A L I T I E S
        //.................  2.2.  L O G I N   W I T H     V A L I D    C R E D E N

        //Step 4
        System.out.println("STEP 4 : *** The user provides valid username or email");
        typeTextInInputField(userNameInputField,"testingDemos");
        String userProvedInputConfirmation = userNameInputField.getAttribute("value");


        //Step 5
        System.out.println("Step 5 : *** The user provides password ");
        passwordInputField.clear();
        passwordInputField.sendKeys("testing");

        //Step 6
        System.out.println("Step 5 : *** The user submits the the login form by clicking on login submit button");
        WebElement loginFormSubmitButton = driver.findElement(By.cssSelector("#sign-in-button"));

        loginFormSubmitButton.click();

        Thread.sleep(4444);
    }

    @AfterMethod
    public void tearDown() {
        if (driver!=null) {
            driver.quit();
        }
    }

    public void consoleLoggerForAMatch (String actual, String expected)  {
        System.out.println(" # # #  The is a match between "+actual + " :: " +expected);

    }

    public void clickOnElement(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public void typeTextInInputField(WebElement element,String text) {
        wait.until(ExpectedConditions.visibilityOf(element));
        element.clear();
        element.sendKeys(text);


    }

}
