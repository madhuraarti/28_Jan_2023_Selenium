package TestNG4;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example4AssertClass4_assertFalse 
{
	 @Test
		public void TC4() 
	   {
		 boolean actResult = true;
	  
		 Assert.assertFalse(actResult,"Failed : avtual result is false-"); 
	   }
}
