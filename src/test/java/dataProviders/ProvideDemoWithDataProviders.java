package dataProviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.lang.reflect.Parameter;

public class ProvideDemoWithDataProviders {

    @DataProvider (name = "mathOperations")
    public Object[][] getDataForDataProvider(){
        return new Object[][] {
            {22,23,"sum"},
            {2,3,"multiply"}
        };
    }


    @Test (dataProvider = "mathOperations")
    public void operateWithMathFunctions(int num1, int num2, String operations) {
        int resut  =0;
        switch (operations){
            case "sum":
               resut = num1+num2;

                System.out.println("The result is :" + resut);
               break;
            default:
                System.out.println("There was not provided date for math opearations");
        }
    }

}
