package TestNG1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class example1_NormalTestClass
{
    public static void main(String[] args) throws InterruptedException 
    {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(5000);
		
		driver.close();
	}
}
