package ActionClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example1_handlingOfDropDown 
{
    public static void main(String[] args) throws InterruptedException 
    {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		// click on close button
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		Thread.sleep(2000);
		
		// Step1:
		
		WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
		
		// Step2:
		
		Actions act =new Actions(driver);
		
		// Step3:
		
		act.moveToElement(login).perform();
		
		Thread.sleep(2000);
		
		// click on wishlist element
		
		driver.findElement(By.xpath("//div[text()='Wishlist']")).click();
		
		
	}
}