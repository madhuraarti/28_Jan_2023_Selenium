package LISTBOX;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EXAMPLE9 
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
        
     s.selectByIndex(1);
     s.selectByIndex(2);
     s.selectByIndex(0);
     s.selectByIndex(3);
     int size = s.getAllSelectedOptions().size();
      System.out.println(size); 
        
 }
}
