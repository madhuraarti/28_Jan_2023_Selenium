package Mock_Daily;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_XpathByIndex 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//click on create new acc
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	  // it is used to go to next web page 
		Thread.sleep(4000);
		// enter FN
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Aishwarya");
		// Enter SurName
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Zagade");
		// Enter mob No.
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("9457622560");
	}
}