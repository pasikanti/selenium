package Selenium;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class apachepoi_Exls {
	 public static void main(String[] args) throws IOException {
	        String excelFileName = "D:/Tested_1.xls";// name of excel file

	        String sheetName = "Gopi";// name of sheet

	        HSSFWorkbook wb = new HSSFWorkbook();
	        HSSFSheet sheet = wb.createSheet(sheetName);

	        // iterating r number of rows
	        for (int r = 0; r < 5; r++) 
	        {
	            HSSFRow row = sheet.createRow(r);
	            // iterating c number of columns
	            for (int c = 0; c < 5; c++) 
	            {
	                HSSFCell cell = row.createCell(c);
	                cell.setCellValue("Cell " + r + " " + c);
	            }
	        }
	        FileOutputStream fileOut = new FileOutputStream(excelFileName);
	        // write this workbook to an Outputstream.
	        wb.write(fileOut);
	        wb.close();
	        
	       /* fileOut.flush();
	        fileOut.close();*/
	    }

}
