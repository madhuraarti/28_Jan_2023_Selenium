package POM_DDF_TestNG_BaseClass_UtilityClass_CaptureSSOfFailedTC_PropertyFile;

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
import org.testng.ITestResult;
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
	
	int TCID;
	
	
	
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
     mobNum.enterMobNum(UtilityClass.getPFData("MobNum"));
     mobNum.clickOnSignInWithPwdBtn();
     pwd.enterPwd(UtilityClass.getPFData("PWD"));
     pwd.clickOnSignInBtn();
     Thread.sleep(3000);
     
    }
	
	@Test  // actual test cases  
	public void verifyFullName() throws InterruptedException, EncryptedDocumentException, IOException     
    {
		 TCID=102;
		 home.openMyAccDropDownOptions();
	     Thread.sleep(2000);
	     myAcc.clickOnMyProfile();
	     profile.switchToSwitchChildWindow();
	   //  profile.verifyFullName(sh.getRow(0).getCell(2).getStringCellValue());
      // now we use assert class
    
	     String actResult=profile.getPBProfilePageFullName();
	     String expResult=UtilityClass.getTextData(0, 2); // TC fail due to wrong data input input is (0,0).and will store in ss
	     
	     Assert.assertEquals(actResult, expResult,"Failed: both results are diff-: ");
    }

	@AfterMethod   
	public void logoutFromApp(ITestResult s1) throws IOException // ITestResult = interface
    {
	 if(s1.getStatus()==ITestResult.FAILURE) 
	 {
		UtilityClass.CaptureSS(driver, TCID);	 
	 }
    }
	@AfterClass
	public void CloseBrowser() throws InterruptedException
    {
		Thread.sleep(2000);
		driver.close();
    }

}
