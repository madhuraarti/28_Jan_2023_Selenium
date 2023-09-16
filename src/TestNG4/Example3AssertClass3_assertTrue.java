package TestNG4;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example3AssertClass3_assertTrue 
{
	 @Test
		public void TC3() 
	   {
		 boolean actResult = false;
	  
		 Assert.assertTrue(actResult,"Failed: actual result is false-"); // it is also shown in the figure
		 
	   //expected [true] but found [false] it is shown in the console
	   
	   }
}