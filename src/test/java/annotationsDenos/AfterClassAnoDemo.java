package annotationsDenos;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import static utils.TestFormatting.provideFormatForTest;

public class AfterClassAnoDemo extends BasicTestngAnnotationDemos {
    @AfterClass
    public void closeBrowserAndSessionForTheLoginTestCases(){

        provideFormatForTest("AFTER class", "#");
    }

    @Test
    public static void verifyUserCanLogWithValidCredentials(){
        provideFormatForTest("TEST LOGIN with Password and USerName", "________");
    }

    @Test
    public static void verifyUserCanNOTLogWithInvalidCredentialsMissingPass(){
        provideFormatForTest("TEST LOGIN only with USerName", "---------");
    }


    @Test
    public static void verifyUserCanNOTLogWithInvalidCredentialsMissingUserName(){
        provideFormatForTest("TEST LOGIN only with pass", "---------");
    }
}
