package LISTBOX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EXAMPLE3 
{
 public static void main(String[] args) throws InterruptedException 
 {
	    WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		Thread.sleep(4000);
		
		//step1 select month
		
        WebElement	mahina	=driver.findElement(By.xpath("//select[@aria-label='Month']"));

       // step2
        
        Select s = new Select(mahina);
        
        boolean result = s.isMultiple();
       
        System.out.println(result);
        
        if(result)
        {
        	System.out.println("this is multiselectable");
        }
        
        else
        {
        	System.out.println("this is single selectable");
        }
 }
}
