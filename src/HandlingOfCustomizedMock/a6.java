package HandlingOfCustomizedMock;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class a6 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver D  = new EdgeDriver();
	D.get("https://www.facebook.com/");
	D.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	D.findElement(By.xpath("//a[text()='Create new account']")).click();
	WebElement Month = D.findElement(By.xpath("//select[@aria-label='Month']"));
	
	Actions A = new Actions(D);
	
	A.click(Month).perform();
	A.sendKeys(Keys.END).perform();
	
	Thread.sleep(3000);
	
	for (int i=1;i<=2;i++)
	{
		A.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(3000);
		
	}
	A.sendKeys(Keys.ENTER).perform();
}
}
