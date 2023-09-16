package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example5_mousedoubleClick 
{
    public static void main(String[] args) throws InterruptedException 
    {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
				
		Thread.sleep(2000);
					
		WebElement doubleClickele = driver.findElement(By.xpath("//button[contains(text(),'ouble-Click')]"));
		
		
		Actions act =new Actions(driver);
		
		// Step3:
		
		act.moveToElement(doubleClickele).perform();
		act.doubleClick().perform();
		
		
		
	}
}