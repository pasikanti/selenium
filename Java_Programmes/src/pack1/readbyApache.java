package pack1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class readbyApache {
	public static void main(String[] args) throws IOException {
		
		FileInputStream file1 = new FileInputStream("D://expenses.xls");
		HSSFWorkbook book1 = new HSSFWorkbook(file1);
		HSSFSheet Sheet1 = book1.getSheetAt(0);
		int rc = Sheet1.getLastRowNum();
		
	   Iterator rows = Sheet1.rowIterator();
	   while(rows.hasNext())
	   {
		  HSSFRow row = (HSSFRow)rows.next();
		 Iterator cells = row.cellIterator();
		  while (cells.hasNext())
		{
			  HSSFCell cell = (HSSFCell)cells.next();
			  if(cell.getCellType()==HSSFCell.CELL_TYPE_STRING)
			  {
			  String k = cell.getStringCellValue();
			  System.out.print(k+"	 ");
			
			  
				  }
			  else
			  {
				  double m = cell.getNumericCellValue();
				  System.out.print(m);
				  System.out.println();
			  }
			  }
		   
	   }
		
		
	}

}
