package HandlingOfCustomizedListBox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example2_Oct_Option2_using_homekey
{

public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	
	// step 1 identify the list box
	
	 WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
	 
	 // step 2 Action and object create 
	 
	 Actions act = new Actions(driver); // action perform
	 
	 // step 3
	 
	 act.click(month).perform(); // list box have to open
	 
	 Thread.sleep(2000);
	 
	 // navigate to first option by default using home key what ever be the current month
	 
	 act.sendKeys(Keys.HOME).perform();
	 Thread.sleep(2000);
	 
	 // step 4 A: navigate to OCT option using "Arrow down" key  
	 
	 // five time call so we can use for loop instead of previous example
	 
	 for (int i=1; i<=9; i++)
	 {
		 act.sendKeys(Keys.DOWN).perform();
		 
		 Thread.sleep(1000);
	 }
	
	 // Step 4C: select option using "Enter " key
	 
	 act.sendKeys(Keys.ENTER).perform();
	 
	
}

}