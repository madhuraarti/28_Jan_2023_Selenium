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

public class example9_getAllDataInASheet
{

 public static void main(String[] args) throws EncryptedDocumentException, IOException 
    {
	     FileInputStream file =new FileInputStream("D:\\auto notes\\28 Jan 2023.xlsx"); // create a non static method 
	     
	  Sheet sh=WorkbookFactory.create(file).getSheet("Sheet3"); // create an object to store a data ie row size
	    
	 int lastRowIndex =sh.getLastRowNum(); // col // 4
	 
	 // for loop is used for multiple data use                      j=0   j=1 j=2 j=3
	           //    4<=3   false                               i=0    00 01  02  03
              //    3=3    true                                 i=1    10 11  12  13  
             //    2<=3    true                                 i=2    20 21  22  23 
             //    1<=3    true                                 i=3    30 31  32  33
            //     0<=3    true                                 i=4    40 41  42  43 
	        
	 for(int i=0;i<=lastRowIndex;i++)  // coloum index start from 0 to 3
	 {
		int lastCellIndex =sh.getRow(i).getLastCellNum()-1; // row // 03
                      // 03
		for(int j=0;j<=lastCellIndex;j++)
		{
			String value= sh.getRow(i).getCell(j).getStringCellValue();
           System.out.print(value+" ");
          }
	 System.out.println();
	 }
    }
}
