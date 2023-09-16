package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ex5 
{
 public static void main(String[] args) throws InterruptedException 
 {
	 WebDriver driver = new FirefoxDriver(); 
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

       // 1: get Text from alert popup
	   String	ash=driver.switchTo().alert().getText();
	   System.out.println(ash);
	   driver.switchTo().alert().accept();
	   Thread.sleep(3000);
	   driver.switchTo().alert().accept();
 }
}
