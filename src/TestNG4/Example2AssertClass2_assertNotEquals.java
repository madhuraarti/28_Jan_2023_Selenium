package TestNG4;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example2AssertClass2_assertNotEquals 
{
	 @Test
		public void TC1() 
	   {
		 String actResult ="hello";
		 String expResult ="hi";
	  
		 Assert.assertNotEquals(actResult, expResult); // static method ie className.methodName();
	   
	   
	   }
}