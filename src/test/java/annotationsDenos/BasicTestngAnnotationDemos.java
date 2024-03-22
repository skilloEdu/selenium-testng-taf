package annotationsDenos;

import basicTestDemo.BasicTestDemonstrationClass;
import org.testng.annotations.Test;

public class BasicTestngAnnotationDemos extends BasicTestDemonstrationClass {

    @Test
    public void basicTestAnnotation(){
        System.out.println("Test is running");
    }
}
