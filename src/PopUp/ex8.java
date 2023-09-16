package PopUp;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ex8 
{
 public static void main(String[] args) throws InterruptedException 
 {
	    WebDriver driver = new FirefoxDriver(); 
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
		// get child window id
		
		
	   Set<String> allIds = driver.getWindowHandles(); 
	    ArrayList<String>al=new ArrayList<String>(allIds);
		
	String childwindow = al.get(1);
		//System.out.println(childwindow);
		Thread.sleep(4000);
	//	switch to child window
		driver.switchTo().window(childwindow);// find id
		
	driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
	
	//switch to main page
	driver.switchTo().window(al.get(0));
	
	driver.findElement(By.xpath("(//input[@type='button'])[3]")).click();
	
		
 }
}
