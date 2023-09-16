package Mock_Daily;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class example1_XpathByText 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new EdgeDriver();
		//driver.get("https://www.policybazaar.com/");
		driver.get("https://www.facebook.com/");
		//driver.findElement("Locator Type")
		//driver.findElement(By.xpath(xpathExpression));
		// login enter
		
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
	   // driver.findElement(By.xpath("//a[@class='sign-in']")).click();
		
		//password enter
		
	//	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12345");
		
	//	driver.findElement(By.xpath(""));
	}
}