package annotationsDenos;

import basicTestDemo.BasicTestDemonstrationClass;
import org.testng.annotations.*;
import utils.TestFormatting;

public class LoginTests extends BasicTestDemonstrationClass {


    @Test (groups = "smoke")
    public void validateUserCanLoginWithValidCredentialsTestsC() {

        provideFormatForTest("TEST", "*");

        System.out.println("The user can login with valid credentials.");
    }

    @Test (groups = "smoke",priority = 0)
    public void validateTheUserCannotLoginWithNoPassowrdA() {

        provideFormatForTest("TEST", "*");

        System.out.println("THE USER CANNOT LOGIN WITH NO PASSWORD.");
    }

    @Test (groups = "smoke",priority = -1)
    public void validateTheUserCannotLoginWithNoUsernameC() {

        provideFormatForTest("TEST", "*");

        System.out.println("THE USER CANNOT LOGIN WITH NO USERNAME.");
    }

    @Test (groups = "smoke",priority = 0)
    public void validateTheUserCannotLoginUserNameLenght8Symbols() {

        provideFormatForTest("TEST", "*");

        System.out.println("THE USER CANNOT LOGIN WITH NO USERNAME with 8 symbols.");
    }

    @Test (groups = "regression")
    public void validateTheUserCannotLoginUserNameLenght44Symbols() {

        provideFormatForTest("TEST", "*");

        System.out.println("THE USER CANNOT LOGIN WITH NO USERNAME with 44 symbols.");
    }

    @Test (dependsOnMethods = "validateUserCanLoginWithValidCredentialsTestsC")
    public void buyASingleProduct(){
        provideFormatForTest("Test","*");
        System.out.println("THE user wiull buy a product");
    }




}
