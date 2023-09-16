package Mock_Daily;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Installation {

	public static void main(String[] args) throws InterruptedException 
	{
		// son class // sub class
		
//	ChromeDriver driver= new ChromeDriver(); // non Static method
	
	//	FirefoxDriver Driver = new FirefoxDriver();
	//	Driver.get("https://www.google.com/");   // void
//        Driver.close();
     
	WebDriver driver1 = new FirefoxDriver();
	driver1.get("https://www.policybazaar.com/?pb_source=google_brand&pb_medium=ppc&pb_term=Policy%20bazaar&pb_campaign=Policy_Bazaar00Brand&gad=1&gclid=Cj0KCQjw2eilBhCCARIsAG0Pf8u5FyQ5EUzag2xvCbl2IQaaYaEhz8fxqKKIqrrZGH5axJHOsBlfuQIaAuJ4EALw_wcB"); // void webdriver
 //  String GoogleTitle= driver1.getTitle();
 //  System.out.println(GoogleTitle);
	Thread.sleep(4000);
	
	String URL =driver1.getCurrentUrl();
	System.out.println(URL);
	
	
	}

}
