package Test_EG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example1_Disable_TCExecution_From_TestClass
{
	
		@Test       // this test case will excecute
		public void TC1 ()   
	    {
		  
	     Reporter.log("----running TC1 ----",true); 
	   
	    } 

		
		@Test(enabled = false)// this test case will not be excecute
		public void TC2()   
	    {
		  
			Reporter.log("----running TC2 ------", true); 
	    }


		
		@Test(enabled = false)
		public void TC3()   
	    {
		  		
			Reporter.log("----running TC3 ----",true ); 
	    }
		
}
