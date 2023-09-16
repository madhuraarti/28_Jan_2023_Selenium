package POM_DDF.copy.copy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// POM Class page 1
public class PBLoginPage 
{
 
	// Step 1: declaration
	@FindBy(xpath="//a[text()='Sign in']") private WebElement SignIn; // no need to use driver.findElement

   // Step 2: initialization
	
public	PBLoginPage(WebDriver driver)

{
     PageFactory.initElements(driver, this);  // diffClassName.methodname(webDriverObject,this_Keyword);
}

// step3: usage

public void clickOnSignInBtn()
{
  SignIn.click();
}

}
