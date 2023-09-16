package TestNG1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class example2_TestNGClass1
{
  
	@Test  // like a main method for execution of program
	public void m1() throws InterruptedException
   {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(5000);
		
		driver.close();
   }
   
}
