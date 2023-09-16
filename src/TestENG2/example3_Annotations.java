package TestENG2;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class example3_Annotations 
{
	 // in one class not use multiple precondition and post condition
	@BeforeMethod  // it is used for login page 
	public void loginToApp() 
	   {
		 Reporter.log("---login To App----", true);
	   }
		// both method will be rung according to alpha batical order then it will be executed // multiple test cases can be used 
	 @Test
	public void verifyFullName() // actual test case // test only for actual test cases
      {
	     Reporter.log("running verify Full Name TC", true);
      }

	 @Test
		public void verifyFullName1() // actual test case
	      {
		     Reporter.log("running verify Full Name1 TC", true);
	      }
	 @AfterMethod  // it is used for logout page
    public void logoutApp()
    {
    	Reporter.log("---logout from App----", true);
	}
	

}


