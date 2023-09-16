package Mock_Daily;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_XpathintaGram 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(3000);
		
		// enter Name
		driver.findElement(By.xpath("(//input[@aria-required='true'])[1]")).sendKeys("djfkgk");
	 
		// Enter Pass
		driver.findElement(By.xpath("(//input[@aria-required='true'])[2]")).sendKeys("Aishwarya");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
	}
}