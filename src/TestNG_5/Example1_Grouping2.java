package TestNG_5;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example1_Grouping2
{
	@Test(groups="login")          // this test case will be excecuted
	public void TC1 ()   
    {
	  
     Reporter.log("----running TC1 ----",true); 
   
    } 

	
	@Test(groups="setting")            // this test case will be excecuted
	public void TC2()   
    {
	  
		Reporter.log("----running TC2 ------", true); 
    }


	
	@Test(groups="setting")   // this test case will  be excecuted
	public void TC3()   
    {
	  		
		Reporter.log("----running TC3 ----",true ); 
    }
	@Test(groups="profile")   // this test case will  be excecuted
	public void TC4()   
    {
	  		
		Reporter.log("----running TC4 ----",true ); 

    }
	
	

}
