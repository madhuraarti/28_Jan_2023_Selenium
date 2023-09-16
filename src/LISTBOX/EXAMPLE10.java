package LISTBOX;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EXAMPLE10 
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
        
        List<WebElement> CollectAllTheData = s.getOptions();
        System.out.println(CollectAllTheData.size());    
      
        for (WebElement S1:CollectAllTheData) 
  	    {
  	    	System.out.println(S1.getText());
  	    	
  	    }
 }
}
