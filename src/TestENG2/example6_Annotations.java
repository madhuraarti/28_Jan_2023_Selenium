package TestENG2;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class example6_Annotations 
{
	  
			
		@BeforeMethod  // it is used for login page 
	   public void loginToApp() 
	   {
		 Reporter.log("---login To App----", true);
	   }
		 

	   @Test
		public void verifyFullName1() // actual test case
	      {
		     Reporter.log("running verify Full Name1 TC", true);
	      }
	  
	   
	   @Test
		public void verifyFullName2() // actual test case
	      {
		     Reporter.log("running verify Full Name2 TC", true);
	      }
	   
	   @AfterMethod  // it is used for logout page
        public void logoutApp()
          {
    	     Reporter.log("---logout from App----", true);
	      }
	
	     @AfterClass
	   public void closeBrowser() 
	     {
		    Reporter.log("---close Browser----", true);
	     }

	     @BeforeClass
		   public void openBrowser() 
		   {
			 Reporter.log("---open Browser----", true);
		   }


}


