package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ex2 
{
 public static void main(String[] args) throws InterruptedException 
 {
	 WebDriver driver = new FirefoxDriver(); 
		driver.get("https://www.flipkart.com/");
		Thread.sleep(6000);
		driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]")).sendKeys("abc");
}
}
