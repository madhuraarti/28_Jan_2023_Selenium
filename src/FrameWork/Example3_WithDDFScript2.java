package FrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Example3_WithDDFScript2 

{
  public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
  {
	  FileInputStream file =new FileInputStream("D:\\auto notes\\28 Jan 2023.xlsx");
	  
	Sheet sh =  WorkbookFactory.create(file).getSheet("DDF");
	  
	  WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.policybazaar.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	   // click on sign in button from login page
	
	  driver.findElement(By.xpath("//a[text()='Sign in']")).click();
	
	  // enter your mobile no
	 	
		driver.findElement(By.xpath("(//input[@id='central-login-module-sign-mobile'])[2]")).sendKeys(sh.getRow(0).getCell(0).getStringCellValue());
		
		// click on sign in with password
		
		driver.findElement(By.xpath("(//span[text()='Sign in with Password'])[2]")).click();
		 
		Thread.sleep(4000);
		 
				// enter password
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(sh.getRow(0).getCell(1).getStringCellValue());
		
		// click on sign in button
		
		 driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		 
		 Thread.sleep(4000);
		// how to handled drop down button
		// open my acc drop down options 
	WebElement	myAcc =driver.findElement(By.xpath("//div[text()='My Account']"));
	Actions act = new Actions(driver);
	act.moveToElement(myAcc).perform();
	
	Thread.sleep(4000);
	
	// click on my profile button
	
	driver.findElement(By.xpath("//span[text()=' My profile ']")).click();
	
	Thread.sleep(4000);
	
	// switch to child window
	
	Set<String>allIds=driver.getWindowHandles();
	ArrayList<String> al = new ArrayList<String>(allIds);
	driver.switchTo().window(al.get(1));
	Thread.sleep(4000);
	
	// get full name
	
	String actText=driver.findElement(By.xpath("//input[@name='personName']")).getAttribute("value"); // actual result
	String expText =sh.getRow(0).getCell(2).getStringCellValue(); // expected result
	
	if(actText.equals(expText))
		
	{
		System.out.println("TC Pass");
	}
		
	else
	{
		System.out.println("TC Fail");
    }
 
	Thread.sleep(4000);
	 driver.quit();
	
  }
  }
