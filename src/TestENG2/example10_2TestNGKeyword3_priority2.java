package TestENG2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example10_2TestNGKeyword3_priority2 
{
	 int num=4; //priority can not variable
	
	@Test // by default priorty is 0  // low priorty
		public void TC3() 
	   {
		 Reporter.log("----running TC3-----", true);
	   }

		 
	 @Test(priority = -2)  // -ve priority // low priority
		public void TC2() 
	   {
		 Reporter.log("----running TC2-----", true);
	   }

	 @Test(priority = num) // duplicate priorty is allowed acc to alpha batical order =3
		public void TC1() 
	  {
		 Reporter.log("----running TC1-----", true);
	  }

	 @Test(priority = 3) // duplicate priorty is allowed acc to alpha batical order =3
		public void TC4() 
	  {
		 Reporter.log("----running TC4-----", true);
	  }

}