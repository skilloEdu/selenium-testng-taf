package provideExeptionDemos;

import org.testng.annotations.Test;
import utils.TestFormatting;

public class ProvideExeptionTestNGDemo extends TestFormatting {

    @Test (expectedExceptions = ArrayIndexOutOfBoundsException.class)
    public void provideExceptionDemoThatTestWillRunIfdeclaredExepctionIsProvided(){
        throw new ArrayIndexOutOfBoundsException("Passed");

    }
}
