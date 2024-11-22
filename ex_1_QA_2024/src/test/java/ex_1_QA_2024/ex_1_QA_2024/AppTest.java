package ex_1_QA_2024.ex_1_QA_2024;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Fadi Marjieh - 312312861
 * Steve Evtushenko - 315914671
 */
public class AppTest {

    ComparingQ tester = new ComparingQ();
    
    // positive test -- regular mode
    @Test
    public void Test_1() {
    	String expectedResult ="A";
    	int a=5, b=3;
    	String mode="regulars";
    	String actualResult=tester.Compare(a, b, mode);
    	assertEquals(expectedResult,actualResult);
    }
    
    
    // positive test -- reciprocals mode
    @Test
    public void Test_2() {
    	String expectedResult ="A";
    	int a=2, b=2;
    	String mode="regulars";
    	String actualResult=tester.Compare(a, b, mode);
    	assertEquals(expectedResult,actualResult);
    }
    
    // positive test -- negatives mode
    @Test
    public void Test_3() {
    	String expectedResult ="B";
    	int a=7, b=3;
    	String mode="negatives";
    	String actualResult=tester.Compare(a, b, mode);
    	assertEquals(expectedResult,actualResult);
    }
    
    /* negative test
     * dividing by zero brings us a fail
     */
    @Test
    public void Test_4() {
    	String expectedResult ="A";
    	int a=-2, b=4;
    	String mode="negatives";
    	String actualResult=tester.Compare(a, b, mode);
    	assertEquals(expectedResult,actualResult);
    }
    
    
    /* negative test
     * giving wrong mode name
     */  
    @Test
    public void Test_5() {
    	String expectedResult ="A";
    	double a=0.5, b=10;
    	String mode="reciprocals";
    	String actualResult=tester.Compare(a, b, mode);
    	assertEquals(expectedResult,actualResult);
    }
    
    @Test
    public void Test_6() {
    	String expectedResult ="B";
    	double a=-2, b=-4;
    	String mode="reciprocals";
    	String actualResult=tester.Compare(a, b, mode);
    	assertEquals(expectedResult,actualResult);
    }
    
    @Test
    public void Test_7() {
    	String expectedResult ="Error";
    	int a=3,b=0;
    	String mode = "reciprocals";
    	try {
    	String actualResult=tester.Compare(a, b, mode);
    	assertEquals(expectedResult,actualResult);
    	} catch(ArithmeticException e) {
    		e.printStackTrace();
    	}
    }

    
}
