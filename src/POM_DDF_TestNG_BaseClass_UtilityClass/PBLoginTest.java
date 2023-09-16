package POM_DDF_TestNG_BaseClass_UtilityClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PBLoginTest extends BaseClass
{
	int a;  // declare globally
	PBLoginPage Login;
	PBMobNumPage mobNum;
	PBPwdPage pwd;
	PBHomePage home;
	PBMyAccPage myAcc;
	PBProfilePage profile;
	
	
	
	
	
	@BeforeClass // one time activity code // it is used to create multiple POM class object
	public void OpenBrowser() throws EncryptedDocumentException, IOException
    {
		
	    
	    initializeBrowser(); // mtd
    
		Login = new PBLoginPage(driver);
		mobNum = new PBMobNumPage(driver);
		pwd = new PBPwdPage(driver);
		home = new PBHomePage(driver);
		myAcc= new PBMyAccPage(driver);
		profile = new PBProfilePage(driver);
        
		//int a =10; // local variable
    
		a=10;// but initialized locally // so similarly we can do
    }
	@BeforeMethod
	public void loginToApp() throws InterruptedException, EncryptedDocumentException, IOException
    {
	 // System.out.println(a);// error due to local variable
     System.out.println(a); // no error due to global variable
     Login.clickOnSignInBtn();
     mobNum.enterMobNum(UtilityClass.getTextData(0, 0));
     mobNum.clickOnSignInWithPwdBtn();
     pwd.enterPwd(UtilityClass.getTextData(0, 1));
     pwd.clickOnSignInBtn();
     Thread.sleep(3000);
     
    }
	
	@Test  // actual test cases  
	public void verifyFullName() throws InterruptedException, EncryptedDocumentException, IOException     
    {
		 home.openMyAccDropDownOptions();
	     Thread.sleep(2000);
	     myAcc.clickOnMyProfile();
	     profile.switchToSwitchChildWindow();
	   //  profile.verifyFullName(sh.getRow(0).getCell(2).getStringCellValue());
      // now we use assert class
    
	     String actResult=profile.getPBProfilePageFullName();
	     String expResult=UtilityClass.getTextData(0, 2);
	     
	     Assert.assertEquals(actResult, expResult,"Failed: both results are diff-: ");
    }

	@AfterMethod   // kindly ignore it
	public void logoutFromApp()
    {
	
    }
	@AfterClass
	public void CloseBrowser() throws InterruptedException
    {
		Thread.sleep(2000);
		driver.close();
    }

}
