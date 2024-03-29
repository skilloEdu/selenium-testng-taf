package homework.calculator;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubtractDigits {

    @DataProvider(name = "numbersProvider")
    public Object[][] getDataForDataProvider(){
        return new Object[][] {
                {23,22,1},
                {5,3,1}
        };
    }
    @Test(dataProvider = "numbersProvider", groups = "subtraction", suiteName = "CalculatorOperations")
    public void verifyUserCanSubtractionTwoDigits(
            double num1,
            double num2,
            double expectedResult){

        double firstProvidedNumber = num1;
        double secondProvidedNumber = num2;
        double expectedSumResult = expectedResult;

        //Actual logic of the test
        double actualSumResult = num1-num2;
        System.out.println("The subtraction of number 1: "+num1 + " and number 2: "+ num2+" is: "+actualSumResult);

        Assert.assertEquals(actualSumResult,expectedResult);
    }
}
