package TestNG4;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example2_2AssertClass2_assertNotEquals 
{
	 @Test
		public void TC1() 
	   {
		 String actResult ="hi";
		 String expResult ="hi";
	  // test case is failed
		 Assert.assertNotEquals(actResult, expResult,"Failed: both results are same-"); // static method ie className.methodName();
	     // system generated error message in the console
	   
	   }
}
