package testngDemos.paralelTestExecutionDemo.basicTestDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import testngDemos.utils.TestFormatting;

public class BasicTestDemonstrationClass extends TestFormatting {

    @BeforeClass
    public void setUp() {

        provideFormatForTest("before class", "|");
        System.out.println("The chrome browser is up and running");
        System.out.println("Chrome settings are provided");
    }

    @BeforeMethod
    public void generateUserNameDataForLoginTestCases() {
        provideFormatForTest("BEFORE methoid", ">");
    }
    @AfterClass
    public void tearDown() {

        provideFormatForTest("AFTER CLASS", "^");
        System.out.println("Chrome browser id closed");
        System.out.println("DB connections are down");
    }
}
