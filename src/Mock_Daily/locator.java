package Mock_Daily;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		   
	       WebDriver driver= new ChromeDriver();
	       
	      driver.get("https://www.policybazaar.com/");
	      driver.findElement(By.xpath("input"));
	
	}
		
		}
