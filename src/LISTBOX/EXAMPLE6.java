package LISTBOX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EXAMPLE6 
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
        
        // step3
        
//        s.selectByVisibleText("Sri");
//        s.selectByVisibleText("Aus");
     s.selectByIndex(1);
     s.selectByIndex(2);
     s.selectByIndex(0);
     s.selectByIndex(3);
     
          
     String text= s.getFirstSelectedOption().getText();
     
     System.out.println(text);
        
 }
}
