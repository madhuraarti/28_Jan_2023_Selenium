package ActionClassMock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class a4 
{
public static void main(String[] args) throws InterruptedException 
{
	 WebDriver driver = new EdgeDriver() ; 
	 driver.manage().window().maximize();
	 driver.get("https://demo.guru99.com/test/drag_drop.html");
	 Thread.sleep(4000);
	WebElement SourceElement = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
	WebElement DestinationElement = driver.findElement(By.xpath("(//ol[@align='center'])[2]"));
	Actions act = new Actions(driver);
	act.dragAndDrop(SourceElement, DestinationElement).perform();
	
	
}
}
