package SS;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class example8 
{
 
public static void main(String[] args) throws IOException 

  {
	  WebDriver driver =new FirefoxDriver();
	  driver.get("https://www.google.com/");
	 
	  String RS =RandomString.make(6);
	  
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	System.out.println(src);
	
	// step2 defined path user  // so screen shot should be stored in defined folder
	
	File dest = new File ("D:\\auto notes\\SS\\Image"+RS+".jpg"); // THIS IS USED FOR WITHOUT GIVING THEIR FILE NAME
	
	FileHandler.copy(src, dest);         // className.methodname(path of source, path of Destination
	 
	
  }
}
