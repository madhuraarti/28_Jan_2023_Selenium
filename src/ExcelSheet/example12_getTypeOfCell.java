package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

// date 9 May 23 

//get data by verifying type of cell

public class example12_getTypeOfCell
{

 public static void main(String[] args) throws EncryptedDocumentException, IOException 
    {
	     FileInputStream file =new FileInputStream("D:\\auto notes\\28 Jan 2023.xlsx"); // create a non static method 
	     
	  Sheet sh=WorkbookFactory.create(file).getSheet("Sheet4"); // create an object to store a data ie row size
	    
	 Cell cellInfo = sh.getRow(2).getCell(0);
	 CellType s1= cellInfo.getCellType();
	
	 if(s1==CellType.STRING)
	 {
		 String value = cellInfo.getStringCellValue();
		 System.out.println(value);
	 }
    
	 else if (s1==CellType.NUMERIC)
	 {
		 double value = cellInfo.getNumericCellValue();
		 System.out.println(value);
	 }
	 else if (s1==CellType.BOOLEAN)
	 {
		 boolean value = cellInfo.getBooleanCellValue();
		 System.out.println(value);
	 }
	 
    }
    }
