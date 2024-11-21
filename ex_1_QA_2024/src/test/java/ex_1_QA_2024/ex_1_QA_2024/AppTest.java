package ex_1_QA_2024.ex_1_QA_2024;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    ComparingQ tester = new ComparingQ();
    
    // positive test -- regular mode
    @Test
    public void Test_1() {
    	String expectedResult ="A";
    	int a=28, b=24;
    	String mode="regulars";
    	String actualResult=tester.Compare(a, b, mode);
    	assertEquals(expectedResult,actualResult);
    }
    
    // positive test -- negatives mode
    @Test
    public void Test_2() {
    	String expectedResult ="B";
    	int a=28, b=24;
    	String mode="negatives";
    	String actualResult=tester.Compare(a, b, mode);
    	assertEquals(expectedResult,actualResult);
    }
    
    // positive test -- reciprocals mode
    @Test
    public void Test_3() {
    	String expectedResult ="B";
    	int a=5, b=3;
    	String mode="reciprocals";
    	String actualResult=tester.Compare(a, b, mode);
    	assertEquals(expectedResult,actualResult);
    }
    
    /* negative test
     * dividing by zero brings us a fail
     */
    @Test
    public void Test_4() {
    	String expectedResult ="A";
    	int a=0, b=3;
    	String mode="reciprocals";
    	String actualResult=tester.Compare(a, b, mode);
    	assertEquals(expectedResult,actualResult);
    }
    
    
    /* negative test
     * giving wrong mode name
     */  
    @Test
    public void Test_5() {
    	String expectedResult ="Mode not recognized";
    	int a=5, b=3;
    	String mode="random";
    	String actualResult=tester.Compare(a, b, mode);
    	assertEquals(expectedResult,actualResult);
    }
    
}
