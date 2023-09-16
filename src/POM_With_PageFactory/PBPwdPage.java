package POM_With_PageFactory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// POM class Page 3

public class PBPwdPage 
{
 @FindBy(xpath ="//input[@name='password']") private WebElement pwd;
 @FindBy(xpath ="//span[text()='Sign in']") private WebElement signIn;
 
public PBPwdPage(WebDriver driver)
 {
	 PageFactory.initElements(driver, this);
 }
 
public void enterPwd() 
{
	pwd.sendKeys("@RTImadhur1");
}
 
public void clickOnSignInBtn()
{
	signIn.click(); 
}

}