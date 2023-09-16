package Mock_Daily;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_XpathByContains 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//create an acc. 
		driver.findElement(By.xpath(" //a[contains(text(),'new')]")).click();
	  Thread.sleep(3000);
		
		// enter FN
	  
	  // it is combination of xpath by contains with attribute and xpath by index.
		
	driver.findElement(By.xpath("(//input[contains(@class,' _2ph-')])[1]")).sendKeys("Aishwarya");
		
	
	}
}