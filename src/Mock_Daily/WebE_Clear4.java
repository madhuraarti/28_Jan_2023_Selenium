package Mock_Daily;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebE_Clear4 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	    	    
	  
	//   String username1 =  driver.findElement(By.xpath("//a[text()='Forgotten password?']")).getText();
	//   System.out.println(username1);
		
		System.out.println(driver.findElement(By.xpath("//a[text()='Forgotten password?']")).getText());
	  
	
	}
}