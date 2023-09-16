package Mock_Daily;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class multipleHandling 
{
 public static void main(String[] args) 
 {
	 WebDriver driver = new FirefoxDriver();
	  driver.get("https://www.facebook.com/");
	 
	 List<WebElement> allelements = driver.findElements(By.xpath("//a"));
 System.out.println(allelements.size());
	 for (WebElement s1:allelements)
 {
  System.out.println(s1.getText());

}
}
}