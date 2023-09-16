package ScreenShotCapture;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotCapture1 
{
 public static void main(String[] args) throws IOException 
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	
	// capture ss of
	
	WebElement ele = driver.findElement(By.xpath("//img[@alt='Facebook']"));
	
	
	File src = ele.getScreenshotAs(OutputType.FILE);
	File dest = new File("D:\\auto notes\\SS\\shide.jpg");
	FileHandler.copy(src, dest);
	
}
}
