package TestNG4;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example1_3AssertClass1_assertEquals 
{
	 @Test
		public void TC1() 
	   {
		 String actResult ="hi";
		 String expResult ="hi";
	   // it will be written when result is fail 
	   Assert.assertEquals(actResult, expResult,"Failed : both results are different-"); // static method ie className.methodName();
	   
	   // fail result due to unequal it will show in console expected [hi] but found [hello]
	   }
}