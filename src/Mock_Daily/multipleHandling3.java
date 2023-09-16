package Mock_Daily;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class multipleHandling3 
{
 public static void main(String[] args) throws InterruptedException 
 {
	 WebDriver driver = new FirefoxDriver();
	  driver.get("D:\\auto notes\\madhur notes\\handling.html");
	 List<WebElement> allelements = driver.findElements(By.xpath("//input[@type='checkbox']"));
     System.out.println(allelements.size());
	 for (int i=0 ; i<=allelements.size()-1;i++)
		 
     {
		 allelements.get(i).click();
        Thread.sleep(500);

}
}
}