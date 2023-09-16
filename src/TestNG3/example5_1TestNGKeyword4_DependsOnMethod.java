package TestNG3;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example5_1TestNGKeyword4_DependsOnMethod
{
	    @Test
		public void login1() 
	   {
		 Reporter.log("---running login1 TC-------", true); 
	   }
   
	   
	    @Test
		public void login2() 
	   {
		 Reporter.log("---running login2 TC-------", true) 
	   }
	    
	    @Test(dependsOnMethods = {"login1","login2"})
	  	public void logout() 
	  	   {
	  		 Reporter.log("----running logout TC----", true); 
	  	   }

       // logout is completely depend upon the login so we used depends on method
  // Total tests run: 3, Passes: 1, Failures: 1, Skips: 1
 // SKIPPED: logout	    
//PASSED: login1
	//    FAILED: login2
	//    java.lang.Error: Unresolved compilation problem: 


}
 