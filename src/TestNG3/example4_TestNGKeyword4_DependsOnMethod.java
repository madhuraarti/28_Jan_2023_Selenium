package TestNG3;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example4_TestNGKeyword4_DependsOnMethod
{
	    @Test
		public void login() 
	   {
		 Reporter.log("---running login TC-------", true); 
	   }
   
	    @Test
	  		public void logout() 
	  	   {
	  		 Reporter.log("----running logout TC----", true); 
	  	   }

       // logout is completely depend upon the login so we used depends on method

}