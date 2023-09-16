package LISTBOX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EXAMPLE4 
{
 public static void main(String[] args) throws InterruptedException 
 {
	    WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/auto%20notes/madhur%20notes/List%20Box/Sample_1.html");
		driver.manage().window().maximize();
				
				
		//step1 select month
		
        WebElement	mahina	=driver.findElement(By.xpath("//select[@multiple='true']"));

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
