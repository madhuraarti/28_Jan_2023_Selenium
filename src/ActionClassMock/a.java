package ActionClassMock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class a 
{
public static void main(String[] args) throws InterruptedException 
{
	 WebDriver driver = new EdgeDriver() ; 
	 driver.manage().window().maximize();
	 driver.get("https://www.flipkart.com/");
	 Thread.sleep(4000);
	 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	 Thread.sleep(4000);
	WebElement login = driver.findElement(By.xpath("(//div[@class='_1psGvi _3BvnxG'])[1]"));
	Actions act = new Actions(driver);
	act.moveToElement(login).perform();
	driver.findElement(By.xpath("(//div [@class='_3vhnxf'])[4]")).click();
}
}
