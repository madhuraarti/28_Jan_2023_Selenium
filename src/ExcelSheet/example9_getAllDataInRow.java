package ExcelSheet;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

// date 8 May 23 

public class example9_getAllDataInRow
{

 public static void main(String[] args) throws EncryptedDocumentException, IOException 
    {
	     FileInputStream file =new FileInputStream("D:\\auto notes\\28 Jan 2023.xlsx"); // create a non static method 
	     
	  Sheet sh=WorkbookFactory.create(file).getSheet("Sheet3"); // create an object to store a data ie row size
	    
	 int lastCellIndex =sh.getRow(0).getLastCellNum()-1;
	 
	 // for loop is used for multiple data use
	           //    4<=3   false
              //    3=3    true
             //    2<=3    true
             //    1<=3    true 
            //     0<=3    true    
	        
	 for(int i=0;i<=lastCellIndex;i++)  // coloum index start from 0 to 3
	 {
	 
       String value= sh.getRow(0).getCell(i).getStringCellValue();
        System.out.print(value+" ");
    } // 0    1     2      3  // col i  row is fixed,  size =4
	// abc1  abc2  abc3  xyz4
    }
    }
