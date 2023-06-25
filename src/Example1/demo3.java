package Example1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demo3
{
    @Test
	public void m1() throws InterruptedException 
   {
	   WebDriver driver=new ChromeDriver();
		  driver.get("https://www.flipkart.com/");
		  
		  Thread.sleep(2000);
		  
		  driver.close();
   }
}
