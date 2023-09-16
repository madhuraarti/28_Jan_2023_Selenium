package TestNG4;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Example5_1SoftAssertClass1 
{
	
	// if first verification is failed then second verification will not be checked so this is the limitation of assert class so we used soft assert class hence overcome the limitation of assert class
	// in soft assert class non static methods are present
	@Test
		public void TC5() 
	   {
		
		SoftAssert soft = new SoftAssert();
		
		
		// first verification
		String actResult ="hello";
		String expResult ="hi";
	    soft.assertEquals(actResult, expResult,"Failed1 : both results are different-");
		
	    // second verification
		boolean actResult1 = false;
	  
		 soft.assertTrue(actResult1,"Failed2 : actual result is false-"); // no second verification is shown
	  
	     soft.assertAll(); // it is used to print in all statements in the console
	   }
}
