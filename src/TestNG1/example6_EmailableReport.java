package TestNG1;

import org.testng.annotations.Test;

public class example6_EmailableReport 
{
    // when we called test class at least min one test cases
	@Test
	public void TC1 ()   // test case or test method
    {
	   System.out.println("running TC1 Test cases");
    }

	
	@Test
	public void TC2()   // test case or test method
    {
	   System.out.println("running TC2 Test cases");// This statement will not show in emailable report
    }


	
	@Test
	public void TC3()   // test case or test method
    {
	   System.out.println("running TC3 Test cases")
    }
	
}