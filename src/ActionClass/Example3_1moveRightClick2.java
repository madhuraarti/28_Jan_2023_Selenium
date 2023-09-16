package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example3_1moveRightClick2 
{
    public static void main(String[] args) throws InterruptedException 
    {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
				
		driver.findElement(By.xpath("//span[text()='right click me']")).click();
		
		Thread.sleep(2000);
		
		// Step1:
		
		WebElement ele = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		// Step2:
		
		Actions act =new Actions(driver);
		
		// Step3:
		
	//	act.moveToElement(ele).perform();
	//	act.contextClick().perform();
		
		act.moveToElement(ele).contextClick().perform();
		
		
	}
}
