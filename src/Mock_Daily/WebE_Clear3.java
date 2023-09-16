package Mock_Daily;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebE_Clear3 
{

	public static void main(String[] args) throws InterruptedException 
	{
		        options = Options();
				options.add_experimental_option('detach', True);
				chrome_driver = webdriver.Chrome()
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	    WebElement username =  driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	    username.click();
	    Thread.sleep(5000);
	    
	  //  WebElement username1 =  driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
	  //  username1.click(); 
	   WebElement username1 =  driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
	   username1.click(); 
	
	}
}