package ScrollUpDown;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_ScrollDown 
{
 public static void main(String[] args) throws InterruptedException 
 {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	Thread.sleep(20000);
	
	//scroll down:--> 1st parameter: 0 , 2nd parameter: +ve
	((JavascriptExecutor)driver).executeScript("window.scrollBy(0,350)");
	
	Thread.sleep(20000);
 }
}
