package Mock_Daily;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class multipleHandling2 
{
 public static void main(String[] args) throws InterruptedException 
 {
	 WebDriver driver = new FirefoxDriver();
	  driver.get("D:\\auto notes\\madhur notes\\handling.html");
	 List<WebElement> allelements = driver.findElements(By.xpath("//input[@type='checkbox']"));
 System.out.println(allelements.size());
	 for (WebElement s1:allelements) // for each loop
 {
  s1.click();
  Thread.sleep(500);

}
}
}