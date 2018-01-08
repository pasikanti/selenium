package pack1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class WritingBYJxL {
	public static void main(String[] args) throws IOException, WriteException {
		File gfile = new File("D:\\gwrited.xls");
		WritableWorkbook wbook = Workbook.createWorkbook(gfile);
		WritableSheet sheet = wbook.createSheet("sheet", 0);
		
		
		Label labl = new Label(0, 0, "gopi");
		sheet.addCell(labl);
		wbook.write();
		wbook.close();
	
	
		
		
				
	}

}
