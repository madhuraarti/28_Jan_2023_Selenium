package Calender;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SelectDateInRedBus2 
{
 public static void main(String[] args) throws InterruptedException 
 {
	    ChromeOptions op =new ChromeOptions();
	    op.addArguments("--disable-notifications"); // notification as it is otherwise it will not be worked.
	 
	    WebDriver driver = new ChromeDriver(op);
	    
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		
		// source:
		
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("pune");
		
		Thread.sleep(2000);
		
		// destination:
		
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("mumbai");
		
		Thread.sleep(2000);
		
		//open date manu
		
		driver.findElement(By.xpath("//text[@class='dateText']")).click();
		
		Thread.sleep(2000);
		
		// navigate expected month --> Aug  // note: stable calender by ctrl + shift + p --->type focus---->click on emulate
		
		while(driver.findElement(By.xpath("//div[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']//div[2]")).getText().contains("Sep")==false) 
		{
			Thread.sleep(1000);
			// click on next button
			driver.findElement(By.xpath("//div[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']/div[3]")).click();
			
			Thread.sleep(3000);
		}
		
		Thread.sleep(1000);
		
		List<WebElement> allDates = driver.findElements(By.xpath("//div[@class='DayTiles__CalendarDaysBlock-sc-1xum02u-0 isgDNj']"));
		
		for(WebElement date:allDates) 
		{
		if(date.getText().contains("4")) 
		{
			date.click();
			break;
		}
		}
}
}
