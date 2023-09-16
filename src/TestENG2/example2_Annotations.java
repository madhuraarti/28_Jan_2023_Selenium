package TestENG2;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class example2_Annotations 
{
	 
	@BeforeMethod
	public void loginToApp() 
	   {
		 Reporter.log("---login To App----", true);
	   }
		
	 @Test
	public void verifyFullName() // actual test case
      {
	     Reporter.log("running verify Full Name TC", true);
      }

   
	 @AfterMethod
    public void logoutApp()
    {
    	Reporter.log("---logout from App----", true);
	}
	

}

