package chromePath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1
{
   public static void main(String[] args) 
   {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("chauhan_madhur81@yahoo.co.in");
	 driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("@RTImadhur1");
     // only for single matching i.e 1 of 1 matching and not for multiple matching. 
	 
	 // if more test case then can do
	 
	// driver.findElement(By.xpath("//input[@id='email']")).sendKeys("chauhan_madhur81@yahoo.co.in");
   }
}
