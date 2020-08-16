package db;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ReadExcell {
	XSSFWorkbook book;
	XSSFSheet sheet;
	XSSFCell cell;
	Object [][] o;
	@DataProvider(name="login")
	  public Object[][] dp() throws IOException  {
	 try {
		 System.exit(0);
		// throw new FileNotFoundException() ;
	 book=new XSSFWorkbook(new FileInputStream(new File("/Users/bittechconsulting/Desktop/BTC190825M/Pandamic/TestNGReview/data.xlsx")));
	sheet= book.getSheetAt(0);
		int rowNum=sheet.getLastRowNum();
		int cellNum=sheet.getRow(0).getLastCellNum();
		o=new Object[rowNum][cellNum];
		for(int i=1;i<=rowNum;i++)
		{
			for(int j=0;j<=cellNum;j++)
			{
				cell=sheet.getRow(i).getCell(j);
				switch(cell.getCellType())
				{
				case XSSFCell.CELL_TYPE_NUMERIC:
				{
					//System.out.println(cell.getNumericCellValue());
					o[i-1][j]=cell.getNumericCellValue();
				}case XSSFCell.CELL_TYPE_STRING:{
				//System.out.println(cell.getStringCellValue());
					o[i-1][j]=cell.getStringCellValue();
				}
			
				
		}
			}
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 finally {
		 if(book!=null)
		 {
		 book.close();
		 }
	 }
	 System.out.println("ho");
	    return o;
	  }

	
}