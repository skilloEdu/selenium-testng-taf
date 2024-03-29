package homework.calculator;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumDigits {

    @DataProvider(name = "numbersProvider")
    public Object[][] getDataForDataProvider(){
        return new Object[][] {
                {22,23,45},
                {2,3,6}
        };
    }
    @Test(dataProvider = "numbersProvider", groups = "sum", suiteName = "CalculatorOperations")
    public void verifyUserCanSumTwoDigits(
                                        double num1,
                                        double num2,
                                        double expectedResult){

        double firstProvidedNumber = num1;
        double secondProvidedNumber = num2;
        double expectedSumResult = expectedResult;

        //Actual logic of the test
        double actualSumResult = num1+num2;
        System.out.println("The sum of number 1: "+num1 + " and number 2: "+ num2+" is: "+actualSumResult);

        Assert.assertEquals(actualSumResult,expectedResult);
    }
}
