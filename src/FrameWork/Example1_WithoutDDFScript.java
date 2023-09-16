package FrameWork;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Example1_WithoutDDFScript 

// test script and test data(inputs) both are in same script
{
  public static void main(String[] args) throws InterruptedException
  {
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.policybazaar.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	   // click on sign in button from login page
	
	  driver.findElement(By.xpath("//a[text()='Sign in']")).click();
	
	  // enter your mobile no
	
		driver.findElement(By.xpath("(//input[@id='central-login-module-sign-mobile'])[2]")).sendKeys("9457622560");
		
		// click on sign in with password
		
		driver.findElement(By.xpath("(//span[text()='Sign in with Password'])[2]")).click();
		 
		Thread.sleep(4000);
		 
				// enter password
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("@RTImadhur1");
		
		// click on sign in button
		
		 driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		 
		 Thread.sleep(4000);
		// how to handled drop down button
		// open my acc drop down options 
	WebElement	myAcc =driver.findElement(By.xpath("//div[text()='My Account']"));
	Actions act = new Actions(driver);
	act.moveToElement(myAcc).perform();
	
	Thread.sleep(6000);
	
	// click on my profile button
	
	driver.findElement(By.xpath("//span[text()=' My profile ']")).click();
	
	Thread.sleep(6000);
	
	// switch to child window
	
	Set<String>allIds=driver.getWindowHandles();
	ArrayList<String> al = new ArrayList<String>(allIds);
	driver.switchTo().window(al.get(1));
	Thread.sleep(6000);
	
	// get full name
	
	String actText=driver.findElement(By.xpath("//input[@name='personName']")).getAttribute("value"); // actual result
	String expText ="MADHUR CHAUHAN"; // expected result
	
	if(actText.equals(expText))
		
	{
		System.out.println("TC Pass");
	}
		
	else
	{
		System.out.println("TC Fail");
    }
 
	Thread.sleep(6000);
	 driver.quit();
	
  }
  }
