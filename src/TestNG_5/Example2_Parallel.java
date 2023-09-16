package TestNG_5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Example2_Parallel 
{
 
	@Test
	public void openFacebookApp() throws InterruptedException 
 {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(4000);
		
		driver.close();
 }
}
