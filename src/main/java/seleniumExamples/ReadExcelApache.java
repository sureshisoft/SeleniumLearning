package seleniumExamples;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

import org.testng.annotations.Test;


public class ReadExcelApache {
	
	public static void main(String args[]) throws IOException
	

	{
		//String excelPath="D:\\Screenshot\\Test.xlsx";
		
		File file =    new File("D:\\Screenshot\\Test.xlsx");
		
		System.out.println("Suresh");
		
		FileInputStream fis= new FileInputStream(file);
		
		System.out.println("ramesh");
		
		XSSFWorkbook Book1 = new XSSFWorkbook(fis);
	
		XSSFSheet sheet=Book1.getSheetAt(0);
		
		int lastRowNumber=sheet.getLastRowNum();
		
		//Get the number of Rows 
		
		System.out.println(lastRowNumber);
		
		int column=sheet.getRow(1).getLastCellNum();
		
		//get the number of columns 
		
		System.out.println(column);
		
		for(int i=0;i<column;i++)
						
		{
			//Collecting all rows count using loop
			XSSFRow Allrow=sheet.getRow(i);
			
			//collecting all columns 
			for(int j=0;j<column;j++)
			{
			     XSSFCell Allcell= Allrow.getCell(j);
			     
			     switch(Allcell.getCellType())
			     {
			     case STRING:System.out.print(Allcell.getStringCellValue());
			     break;
			     case NUMERIC:System.out.print(Allcell.getNumericCellValue());
			     break;			    	 
			     }
			     System.out.print(" ||");
		}
			System.out.println();
		
	}

	}
}
