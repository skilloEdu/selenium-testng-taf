package seleniumDemos.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTests {
    public static final String BASE_URL = "http://training.skillo-bg.com:4200/posts/all";
    public static int WAIT = 2222;

    @Test
    public void verifyUserCanNavigateToLoginPage () throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get(BASE_URL);
        String actualPageTitle = driver.getTitle();
        System.out.println("THE PAGE TITLE IS : "+ actualPageTitle);

        //Verify login button shown
        WebElement navLoginButton = driver.findElement(By.cssSelector("#nav-link-login"));
        boolean isNavLoginButtonShown = navLoginButton.isDisplayed();
        Assert.assertTrue(isNavLoginButtonShown);

        //Verify the user can navigate from homePage to loginPage
        navLoginButton.click();

        //Verify the user is on login page
        WebElement loginFormHeader = driver.findElement(By.xpath("//p[contains(.,'Sign in')]"));

        boolean isLoginHeaderPresented = loginFormHeader.isDisplayed();
        Assert.assertTrue(isLoginHeaderPresented);

        String getTextProvided = loginFormHeader.getText();
        String getTextByAttributeValue = loginFormHeader.getAttribute("value");

        Thread.sleep(WAIT);

        driver.quit();
    }


}
