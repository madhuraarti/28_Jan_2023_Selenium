package HandlingOfDynamicElementMock;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class a 
{
 public static void main(String[] args) throws InterruptedException 
 {
	WebDriver driver = new EdgeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("redmi 9 power");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(4000);
	String Review = driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[1]//span)[9]")).getText();
	System.out.println(Review);
}
}
