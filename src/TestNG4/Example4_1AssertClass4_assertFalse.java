package TestNG4;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example4_1AssertClass4_assertFalse 
{
	 @Test
		public void TC4() 
	   {
		 boolean actResult = false;
	  
		 Assert.assertFalse(actResult); 
	   }
}
