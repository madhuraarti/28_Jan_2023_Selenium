package Calender;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class demochatGbt 
{
		
	    public static void main(String[] args) throws EncryptedDocumentException, IOException
	    {
	        // Set the path to the ChromeDriver executable
	        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");

	        // Create a new instance of the ChromeDriver
	        WebDriver driver = new ChromeDriver();

	        // Navigate to the Facebook login page
	        driver.get("https://www.facebook.com");

	        // Find the email or phone input field
	        WebElement emailField = driver.findElement(By.id("email"));

	        // Enter your email or phone number
	        emailField.sendKeys("your_email_or_phone");

	        // Find the password input field
	        WebElement passwordField = driver.findElement(By.id("pass"));

	        // Enter your password
	        passwordField.sendKeys("your_password");

	        // Find the login button
	        WebElement loginButton = driver.findElement(By.name("login"));

	        // Click on the login button
	        loginButton.click();

	        // Wait for the login process to complete
	        try {
	            Thread.sleep(5000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        // Close the browser
	        driver.quit();
	    }
	}


