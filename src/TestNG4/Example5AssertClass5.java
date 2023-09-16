package TestNG4;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example5AssertClass5 
{
	
	// if first verifaction is failed then second verification will not be checked so this is the limitation of assert class
	
	@Test
		public void TC5() 
	   {
		 // first verification
		String actResult ="hello";
		String expResult ="hi";
	    Assert.assertEquals(actResult, expResult,"Failed : both results are different-");
		
	    // second verification
		boolean actResult1 = true;
	  
		 Assert.assertTrue(actResult1,"Failed2 : actual result is false-"); // no second verification is shown
	   }
}