package Mock_Daily;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example5_isEnabled3 

{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(5000);
		// enter Name
		driver.findElement(By.xpath("(//input[@aria-required='true'])[1]")).sendKeys("djfkgk");
		
		Thread.sleep(5000);
		// Enter Pass
		driver.findElement(By.xpath("(//input[@aria-required='true'])[2]")).sendKeys("Aishwarya");
				
		Thread.sleep(5000);
				
				
		boolean result=driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).isEnabled();
		System.out.println(result);
		
		if(result)
		{
			System.out.println("Element is enabled");			
		}
		else
		{
			System.out.println("Element is disabled");
		}
	
	}
	
}