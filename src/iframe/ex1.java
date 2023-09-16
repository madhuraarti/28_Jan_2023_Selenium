package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ex1 
{
 public static void main(String[] args) throws InterruptedException 
 {
	WebDriver driver = new FirefoxDriver(); 
	driver.manage().window().maximize();
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	
   // driver.switchTo().frame(nameOrId)
	//Thread.sleep(4000);
//	driver.switchTo().frame("iframeResult");// id
	driver.switchTo().frame("iframeResult");
	driver.findElement(By.xpath("//button[@type='button']")).click();
	
	// switch to main page
	
	Thread.sleep(2000);
	
	driver.switchTo().defaultContent();
	
	driver.findElement(By.xpath("//a[@title='Open Menu']")).click();
	
	
 }
}
