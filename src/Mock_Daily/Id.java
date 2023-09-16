package Mock_Daily;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///D:/auto%20notes/madhur%20notes/tag%20&%20id/sample17.html");
		
		//FN
		driver.findElement(By.className("abc123")).sendKeys("abc");
		//LN
		driver.findElement(By.className("abc456")).sendKeys("xyz");
	}
}