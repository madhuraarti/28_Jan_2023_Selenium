package TestNG_6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Example1_MultiBrowserTesting3 
{
   // it is called compatibality testing // we can run same code in different browsers
    @Parameters("browserName")
	@Test
	public void TC1(String browserName ) throws InterruptedException   
    {
    	WebDriver driver =null; // null means dont know
    	
    	if(browserName.equals("firefox")) // for comparsion
		{
			 driver = new FirefoxDriver();
		}
			
		else if (browserName.equals("edge"))
		{
			 driver = new  EdgeDriver();
		}
      driver.get("https://www.facebook.com/");
      //driver.manage().window().maximize();
      Thread.sleep(4000);
      driver.quit();
      
      
    }



}
