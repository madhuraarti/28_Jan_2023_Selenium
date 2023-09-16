package POM_DDF_TestNG_BaseClass_UtilityClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilityClass 
  {
	//@autherName:Sanjay
	//This method is use to get Test data from excel sheet.
	// need to pass 2 inputs: 1 rowIndex,2 colIndex 
	
	
	public static String getTextData(int rowIndex,int colIndex) throws EncryptedDocumentException, IOException 
   {
	  FileInputStream file =new FileInputStream("D:\\auto notes\\28 Jan 2023.xlsx");  
	  Sheet sh=WorkbookFactory.create(file).getSheet("DDF");
     String value = sh.getRow(rowIndex).getCell(colIndex).getStringCellValue();
     return value;
   
   }
  
  
  }
