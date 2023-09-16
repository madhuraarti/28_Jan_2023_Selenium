package TestNG_6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Example1_MultiBrowserTesting2 
{
   // it is called compatibality testing
    @Parameters("browserName")
	@Test
	public void TC1(String browserName ) throws InterruptedException   
    {
    	WebDriver driver =null;  // it is used as a global variable
    	
    	if(browserName.equals("chrome")) // for comparsion
		{
			 driver = new ChromeDriver();
		}
		else if (browserName.equals("firefox"))
		{
			 driver = new  FirefoxDriver();
		}
		
		else if (browserName.equals("edge"))
		{
			driver = new  EdgeDriver();
		}
    
    	 driver.get("https://www.facebook.com/");
         driver.manage().window().maximize();
         Thread.sleep(4000);
         driver.quit();
    }



}