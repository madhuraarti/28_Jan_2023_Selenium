package ActionClassMock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class a2 
{
public static void main(String[] args) throws InterruptedException 
{
	 WebDriver driver = new EdgeDriver() ; 
	 driver.manage().window().maximize();
	 driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	 Thread.sleep(4000);
	WebElement rightclick = driver.findElement(By.xpath("//span[text()='right click me']"));
	Actions act = new Actions(driver);
	act.moveToElement(rightclick).contextClick().perform();
	//act.contextClick().perform();
	
}
}
