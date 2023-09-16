package ScrollUpDown;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_ScrollRightLeft3 
{
 public static void main(String[] args) throws InterruptedException 
 {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	Thread.sleep(20000);
	
	//scroll Right:--> 1st parameter: +ve , 2nd parameter: 0
	((JavascriptExecutor)driver).executeScript("window.scrollBy(100,0)");
	
	Thread.sleep(20000);
	
	//scroll left:--> 1st parameter:-ve  , 2nd parameter: 0
		((JavascriptExecutor)driver).executeScript("window.scrollBy(-50,0)");
		
	
 }
}
