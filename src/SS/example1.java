package SS;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class example1 
{
  

public static void main(String[] args) throws IOException 
	

  {
	  WebDriver driver =new FirefoxDriver(); // upcasting
	  driver.get("https://www.facebook.com/");
	 
	  // Step1 take screen shot
	 
	  //  first we have to write ((type))
	  
	  
	 
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); // downcasting
	System.out.println(src);
	
	// step2 defined path user  // so screen shot should be stored in defined folder
		File dest = new File ("D:\\auto notes\\SS\\anb1234.jpg");
		FileHandler.copy(src, dest);         // className.methodname(path of source, path of Destination
	
  }
}