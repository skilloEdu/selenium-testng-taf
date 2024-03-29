package testngDemos.utils;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class TestFormatting  {

    public static void provideFormatForTest(String anno, String separator){

        System.out.println();

        for (int i = 0; i < 40 ; i++) {

            System.out.print(separator);
        }
        System.out.println();

        System.out.println("THIS IS ANNOTATION: " + anno.toUpperCase());

        System.out.println();

        for (int i = 0; i < 40 ; i++) {

            System.out.print(separator);
        }
        System.out.println();

    }


}
