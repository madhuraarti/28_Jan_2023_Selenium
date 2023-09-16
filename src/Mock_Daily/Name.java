package Mock_Daily;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///D:/auto%20notes/madhur%20notes/tag%20&%20id/sample19.html");
		Thread.sleep(1000);
		//FN
		driver.findElement(By.linkText("facebook")).click();
		
	}
}