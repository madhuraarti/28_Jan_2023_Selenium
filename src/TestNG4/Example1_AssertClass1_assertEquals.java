package TestNG4;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example1_AssertClass1_assertEquals 
{
	 @Test
		public void TC1() 
	   {
		 String actResult ="hi";
		 String expResult ="hi";
	   
	   Assert.assertEquals(actResult, expResult); // static method i.e className.methodName();
	   
	   
	   }
}
