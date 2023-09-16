package Mock_Daily;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example6_isSelected2
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		//click on create new account link
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(2000);
		
		WebElement  femaleRadioBtn = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
						
		femaleRadioBtn.click();
		
		
		
		boolean result =femaleRadioBtn.isSelected();
		
		System.out.println(result);
		
	if (result)
	{
		System.out.println("radio button selected");
	}
	
	else
	{
		System.out.println("radio button de-selected");	
	}
	
	}




}