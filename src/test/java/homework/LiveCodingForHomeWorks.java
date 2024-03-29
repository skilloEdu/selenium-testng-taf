package homework;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.*;

public class LiveCodingForHomeWorks {
    @Test ()
    public void verifyTheUserCanSumTwoNumbers(double num1, double num2, String mathOperation ){

        double firstProvidedNumber = 0;
        double secondProvidedNumber = 0;
        String providedMathOperation = "";

        double expectedResult = 0;

        double actualResult = firstProvidedNumber + secondProvidedNumber;

        //The Autmation script to verify that the exepcted is eaqual to re
        Assert.assertEquals(actualResult,expectedResult);

    }


}
