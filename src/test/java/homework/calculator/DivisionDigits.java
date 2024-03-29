package homework.calculator;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivisionDigits {
    @DataProvider(name = "numbersProvider")
    public Object[][] getDataForDataProvider(){
        return new Object[][] {
                {9,3,3},
                {15,3,4}
        };
    }
    @Test(dataProvider = "numbersProvider", groups = "divide", suiteName = "CalculatorOperations")
    public void verifyUserCanDivideTwoDigits(
            double num1,
            double num2,
            double expectedResult){

        double firstProvidedNumber = num1;
        double secondProvidedNumber = num2;
        double expectedSumResult = expectedResult;

        //Actual logic of the test
        double actualSumResult = num1/num2;
        System.out.println("The division result of number 1: "+num1 + " and number 2: "+ num2+" is: "+actualSumResult);

        Assert.assertEquals(actualSumResult,expectedResult);
    }
}
