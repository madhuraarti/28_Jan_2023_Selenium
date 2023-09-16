package TestNG4;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example1_1AssertClass1_assertEquals 
{
	 @Test
		public void TC1() 
	   {
		 String actResult ="hello";
		 String expResult ="hi";
	   
	   Assert.assertEquals(actResult, expResult); // static method ie className.methodName();
	   
	   // fail result due to unequal it will show in console expected [hi] but found [hello]
	   }
}
