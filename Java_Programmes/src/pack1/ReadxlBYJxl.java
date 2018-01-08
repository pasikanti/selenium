package pack1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import jxl.CellType;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.JxlWriteException;
import jxl.write.biff.RowsExceededException;


public class ReadxlBYJxl {
	
	public static void main(String[] args) throws BiffException, IOException, JxlWriteException, WriteException
	{
		FileInputStream file = new FileInputStream("D:\\gopitabale.xls");
		Workbook book1 = Workbook.getWorkbook(file);
		Sheet sheet1 = book1.getSheet(0);
		int rc = sheet1.getRows();
		int cc = sheet1.getColumns();
		
		for (int i=0; i<rc; i++)
		{
		for (int j=0; j<cc; j++)
		{
			String k = sheet1.getCell(j, i).getContents();
			
			System.out.print(k+" ");
		}
		System.out.println();
		}
		
		
		
		
		book1.close();
	}

}
