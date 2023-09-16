package autosugestionMock;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class a 
{
 public static void main(String[] args) throws InterruptedException 
 {
	 WebDriver driver = new FirefoxDriver(); 
	 driver.get("https://www.google.com/");
	 driver.findElement(By.xpath("//textarea[@jsname='yZiJbe']")).sendKeys("redmi");
	 Thread.sleep(6000);
	List<WebElement> alloptions = driver.findElements(By.xpath("//ul[@jsname='bw4e9b']/li"));
	
	String expectationResult = "redmi note 10";
	for(WebElement s1:alloptions) 
	{
		
		String  actualResult  = s1.getText();
		
		if(actualResult.equals(expectationResult))
		{
			s1.click();
			break;
		}
	}
	 
}
}
