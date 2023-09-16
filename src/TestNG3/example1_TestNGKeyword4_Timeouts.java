package TestNG3;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example1_TestNGKeyword4_Timeouts
{
	 @Test(timeOut =5000) // time in milli sec // practically time will be 2 or 3 sec
		public void TC1() 
	   {
		 Reporter.log("running TC1", true); // this method will take only 1 sec // no error
	   }
}
