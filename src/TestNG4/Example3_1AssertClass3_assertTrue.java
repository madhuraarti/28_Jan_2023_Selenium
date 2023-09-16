package TestNG4;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example3_1AssertClass3_assertTrue
{
	 @Test
		public void TC3() 
	   {
		 boolean actResult = true;
	  
		 Assert.assertTrue(actResult);
		 
	      
	   }
}
