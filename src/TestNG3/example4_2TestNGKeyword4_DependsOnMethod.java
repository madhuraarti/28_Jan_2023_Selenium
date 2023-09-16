package TestNG3;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example4_2TestNGKeyword4_DependsOnMethod
{
	    @Test
		public void login() 
	   {
		 Reporter.log("---running login TC-------", true) 
	   }
   
	    @Test(dependsOnMethods ="login")
	  		public void logout() 
	  	   {
	  		 Reporter.log("----running logout TC----", true); //SKIPPED: logout in the console because preconditioned hsa been failed 
	  	   }

       // logout is completely depend upon the login so we used depends on method

}