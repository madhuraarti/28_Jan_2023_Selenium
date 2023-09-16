package HandlingOfCustomizedMock;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class a 
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
	
	Thread.sleep(2000);
	
	A.sendKeys(Keys.ARROW_UP).perform();
	
}
}
