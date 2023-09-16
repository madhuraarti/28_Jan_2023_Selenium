package PopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ex6 
{
 public static void main(String[] args) throws InterruptedException 
 {
	 WebDriver driver = new FirefoxDriver(); 
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

       // 1: get Text from alert popup
		
		Alert alt = driver.switchTo().alert();
		
	   String ash=alt.getText();
	   System.out.println(ash);
	   alt.accept();
	   Thread.sleep(3000);
	   alt.accept();
 }
}
