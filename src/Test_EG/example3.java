package Test_EG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example3
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


		
		@Test// this test case will  be excecuted
		public void TC3()   
	    {
		  		
			Reporter.log("----running TC3 ----",true ); 
	    }
		@Test// this test case will  be excecuted
		public void TC4()   
	    {
		  		
			Reporter.log("----running TC4 ----",true )

	    }
		
		@Test// this test case will  be excecuted
		public void TC5()   
	    {
		  		
			Reporter.log("----running TC5 ----",true ) 

	    }   

}
