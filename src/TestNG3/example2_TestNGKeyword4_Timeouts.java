package TestNG3;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example2_TestNGKeyword4_Timeouts
{
	 @Test(timeOut =5000) // time in milli sec // practically time will be 2 or 3 sec
		public void TC1() throws InterruptedException 
	   {
		 Thread.sleep(7000); // test case will be fail
		 Reporter.log("running TC1", true); // this method will take only 1 sec
	   }
    // result: TC1() didn't finish within the time-out 5000 // error in console

}