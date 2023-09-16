package POM_DDF_TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PBLoginTest 
{
 public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
  {
	    
		
		
		Login.clickOnSignInBtn();

		
		String MobileNumber= sh.getRow(0).getCell(0).getStringCellValue();
		mobNum.enterMobNum(MobileNumber);
		mobNum.clickOnSignInWithPwdBtn();
		Thread.sleep(2000);
		
		
		String password= sh.getRow(0).getCell(1).getStringCellValue();
		pwd.enterPwd(password);
		pwd.clickOnSignInBtn();
		Thread.sleep(2000);
		
		
		home.openMyAccDropDownOptions();
		Thread.sleep(2000);
		
		
		myAcc.clickOnMyProfile();
		Thread.sleep(2000);
		
		
		profile.switchToSwitchChildWindow();
		
	    String expFullName	=sh.getRow(0).getCell(2).getStringCellValue();
		profile.verifyFullName(expFullName);
		Thread.sleep(2000);
		
		driver.quit();
  }
}
