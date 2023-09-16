package TestENG2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example8_2TestNGKeyword2_EnableFalse 
{
	 @Test
		public void TC1() 
	   {
		 Reporter.log("----running TC1-----", true);
	   }

	 // we can disable multiple TC
	 
	 @Test(enabled = false)
		public void TC2() 
	   {
		 Reporter.log("----running TC2-----", true);
	   }

	 @Test(enabled = false)  // this TC is NOT Excetued 
		public void TC3() 
	  {
		 Reporter.log("----running TC3-----", true);
	  }


}