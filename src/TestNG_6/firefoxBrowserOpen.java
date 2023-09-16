package TestNG_6;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxBrowserOpen 
{
  public static void main(String[] args)
  {
	  FirefoxDriver driver = new  FirefoxDriver();
	  driver.get("https://www.facebook.com/");
  }
}
