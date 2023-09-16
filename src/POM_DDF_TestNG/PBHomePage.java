package POM_DDF_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//POM Class Page 4
public class PBHomePage 

   {
     @FindBy(xpath ="//div[text()='My Account']") private WebElement myAcc;
	
	WebDriver driver1;
	
        public PBHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);  // this keyword is used to globle varible
	    driver1=driver; 
	}

       public void openMyAccDropDownOptions()
    {
	 Actions act = new Actions(driver1);
	 act.moveToElement(myAcc).perform();
	 
    }
}
