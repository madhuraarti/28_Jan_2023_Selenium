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


public class example1_getStringData3
{

 public static void main(String[] args) throws EncryptedDocumentException, IOException 
    {
	     FileInputStream file =new FileInputStream("D:\\auto notes\\28 Jan 2023.xlsx");
         
	  int  colsize=  WorkbookFactory.create(file).getSheet("Sheet2").getRow(0).getLastCellNum();
	 
	     
	     System.out.println(colsize);
    
    }

}
