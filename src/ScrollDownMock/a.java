package ScrollDownMock;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class a 
{
 public static void main(String[] args) throws InterruptedException 
 {
	WebDriver driver = new EdgeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(4000);
	WebElement helps = driver.findElement(By.xpath("//a[text()='Help']"));
	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", helps);
//	Thread.sleep(4000);
	//((JavascriptExecutor)driver).executeScript("window.scrollBy(0,350)");
//	Thread.sleep(4000);
//	((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-350)");
}
}
