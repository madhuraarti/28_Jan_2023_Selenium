package TestNG3;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example5_TestNGKeyword4_DependsOnMethod
{
	    @Test
		public void login1() 
	   {
		 Reporter.log("---running login1 TC-------", true); 
	   }
   
	   
	    @Test
		public void login2() 
	   {
		 Reporter.log("---running login2 TC-------", true); 
	   }
	    
	    @Test(dependsOnMethods = {"login1","login2"})
	  	public void logout() 
	  	   {
	  		 Reporter.log("----running logout TC----", true); 
	  	   }

       // logout is completely depend upon the login so we used depends on method

}
 