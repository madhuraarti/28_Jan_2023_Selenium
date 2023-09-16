package POM_DDF_TestNG.copy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PBLoginTest2
{
	int a;  // declare globally
	PBLoginPage Login;
	PBMobNumPage mobNum;
	PBPwdPage pwd;
	PBHomePage home;
	PBMyAccPage myAcc;
	PBProfilePage profile;
	
	Sheet sh;
	
	WebDriver driver;
	
	@BeforeClass // one time activity code // it is used to create multiple POM class object
	public void OpenBrowser() throws EncryptedDocumentException, IOException
    {
		FileInputStream file =new FileInputStream("D:\\auto notes\\28 Jan 2023.xlsx");  
	    sh=WorkbookFactory.create(file).getSheet("DDF");
	    
	    driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); 
    
		Login = new PBLoginPage(driver);
		mobNum = new PBMobNumPage(driver);
		pwd = new PBPwdPage(driver);
		home = new PBHomePage(driver);
		myAcc= new PBMyAccPage(driver);
		profile = new PBProfilePage(driver);
        
		//int a =10; // local variable
    
		a=10;// but initialised locally // so similarly we can do
    }
	@BeforeMethod
	public void loginToApp() throws InterruptedException
    {
	 // System.out.println(a);// error due to local variable
     System.out.println(a); // no error due to globle variable
     Login.clickOnSignInBtn();
     mobNum.enterMobNum(sh.getRow(0).getCell(0).getStringCellValue());
     mobNum.clickOnSignInWithPwdBtn();
     pwd.enterPwd(sh.getRow(0).getCell(1).getStringCellValue());
     pwd.clickOnSignInBtn();
     Thread.sleep(4000);
     
    }
	
	@Test  // actual test cases  
	public void verifyFullName() throws InterruptedException     
    {
		 home.openMyAccDropDownOptions();
	     Thread.sleep(4000);
	     myAcc.clickOnMyProfile();
	     profile.switchToSwitchChildWindow();
	   //  profile.verifyFullName(sh.getRow(0).getCell(2).getStringCellValue());
      // now we use assert class
    
	     String actResult=profile.getPBProfilePageFullName();
	     String expResult=sh.getRow(0).getCell(2).getStringCellValue();
	     
	     Assert.assertEquals(actResult, expResult,"Failed: both results are diff-: ");
    }

	@AfterMethod   // kindly ignore it
	public void logoutFromApp()
    {
	
    }
	@AfterClass
	public void CloseBrowser() throws InterruptedException
    {
		Thread.sleep(4000);
		driver.close();
    }

}
