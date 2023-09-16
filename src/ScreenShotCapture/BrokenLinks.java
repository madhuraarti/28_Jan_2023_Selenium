package ScreenShotCapture;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks 
{
   public static void main(String[] args) 
{
	String homePageUrl ="https://www.zlti.com/";
	String url ="";
	HttpURLConnection huc =null;
	int respCode =200;
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(homePageUrl);  
	
//	List<WebElement> AllLinks =driver.findElements(By.tagName("a"));
	             // OR
	List<WebElement> AllLinks =driver.findElements(By.xpath("//a"));
	
	for(WebElement link:AllLinks)
	{
		url = link.getAttribute("href");
	    
		if(url ==null || url.isEmpty()) 
		{
			System.out.println("URL is empty or null:- "+url);
			continue;  // current loop stop then go to next loop. it is different from break.
		}
	    if(!url.startsWith(homePageUrl)) 
	    {
	    	System.out.println("URL belongs to another domain, skipping it:-"+url);
	    	continue;
	    }
	
	    try 
	    {
	    	huc = (HttpURLConnection)(new URL(url).openConnection());
	    	huc.setRequestMethod("HEAD");
	    	huc.connect();
	    	
	    	respCode =huc.getResponseCode();
	    	
	    	if(respCode>=400)
	    	{
	    		System.out.println(url+" -is a broken link");
	    	}
	    	
	    }	
	    	
	    catch(MalformedURLException e)
	    {
	    	e.printStackTrace();
	    }	    	
	    catch(IOException e)
	    {
	    	e.printStackTrace();
	    }	
	    }
	
	driver.quit();
	
	
	   
	   
	   
	   
}
}
