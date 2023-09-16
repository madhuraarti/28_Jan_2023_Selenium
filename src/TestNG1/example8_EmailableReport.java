package TestNG1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example8_EmailableReport 

// one method one case
{
    // when we called test class at least min one test cases
	@Test
	public void TC1 ()   // test case or test method
    {
	  // System.out.println("running TC1 Test cases"); // This is not show in emailable report 
     Reporter.log("running TC1 Test cases"); // different class.methodName("message",Boolean); // hence attached with emailable report
     // will not show in console // static method
   
    } 

	
	@Test
	public void TC2()   // test case or test method
    {
	  //  System.out.println("running TC2 Test cases");
		Reporter.log("running TC2 Test cases", false); // will not show in console
    
    }


	
	@Test
	public void TC3()   // test case or test method
    {
	  // System.out.println("running TC3 Test cases");
		
		Reporter.log("running TC3 Test cases", false); // will not show in console
    }
	
}