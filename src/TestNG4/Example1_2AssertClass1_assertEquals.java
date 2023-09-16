package TestNG4;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example1_2AssertClass1_assertEquals 
{
	 @Test
		public void TC1() 
	   {
		 String actResult ="hello";
		 String expResult ="hi";
	   // it will be written when result is fail so it will show in the console
	   Assert.assertEquals(actResult, expResult,"Failed : both results are different-"); // static method ie className.methodName();
	   
	   // fail result due to unequal it will show in console expected [hi] but found [hello]
	   }
}
