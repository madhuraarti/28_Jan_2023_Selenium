package POM_DDF_TestNG_BaseClass_UtilityClass;
// POM Class Page 2

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMobNumPage 
{
	    @FindBy(xpath="(//input[@id='central-login-module-sign-mobile'])[2]") private WebElement mobNum;
	    @FindBy(xpath="(//span[text()='Sign in with Password'])[2]")  private WebElement signinWithPwd;
	    
	    
	   public PBMobNumPage(WebDriver driver)
	   
	   {
		  
		PageFactory.initElements(driver, this);
	   
	   }

	   public void enterMobNum(String mobileNum) // method with string parameters
	   {
		   mobNum.sendKeys(mobileNum);
		   
	   }
	  
	   public void clickOnSignInWithPwdBtn()
	   {
		   signinWithPwd.click();
	   }
}

