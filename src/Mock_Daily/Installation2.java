package Mock_Daily;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Installation2 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		{
    
	ChromeDriver driver1;  //Webdriver driver: global variable // 
	
	driver1 = new ChromeDriver();
	driver1.navigate().to("https://www.policybazaar.com/");
	
	 
		Thread.sleep(4000);
		
		
		driver1.navigate().to("https://www.flipkart.com/");
		Thread.sleep(4000);
		
		driver1.navigate().back();
		driver1.manage().window().maximize();
		Thread.sleep(4000);
		driver1.navigate().refresh();
		}}}