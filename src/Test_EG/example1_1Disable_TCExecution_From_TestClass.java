package Test_EG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example1_1Disable_TCExecution_From_TestClass
{
	
		@Test       // this test case will be excecuted
		public void TC1 ()   
	    {
		  
	     Reporter.log("----running TC1 ----",true); 
	   
	    } 

		
		@Test         // this test case will be excecuted
		public void TC2()   
	    {
		  
			Reporter.log("----running TC2 ------", true); 
	    }


		
		@Test(enabled = false) // this test case will not be excecuted
		public void TC3()   
	    {
		  		
			Reporter.log("----running TC3 ----",true ); 
	    }
		
}
