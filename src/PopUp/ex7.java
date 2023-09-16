package PopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ex7 
{
 public static void main(String[] args) throws InterruptedException 
 {
	    WebDriver driver = new FirefoxDriver(); 
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("abc");
       
 }
}
