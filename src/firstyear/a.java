package firstyear;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class a 
{
 public static void main(String[] args) 
 {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://scholar.google.com/");
	driver.findElement(By.xpath("(//span[text()='My profile'])[1]")).click();
 }
}
