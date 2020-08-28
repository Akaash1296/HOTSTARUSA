package libraries;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GenericLib implements IAutoConstants{
   public String getValue(String sheet, int r, int c) {	   
	   String value = "";
	   try {
		FileInputStream fin = new FileInputStream(XLPATH);
		Workbook wb = WorkbookFactory.create(fin);
		value = wb.getSheet(sheet).getRow(r).getCell(c).getStringCellValue();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   return value;
   }
   
   public int getRowCount(String sheet) {
	   int rc = 0;
	   try {
			FileInputStream fin = new FileInputStream(XLPATH);
			Workbook wb = WorkbookFactory.create(fin);
			rc = wb.getSheet(sheet).getLastRowNum();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   return rc;
   }
   
   public int getCellCount(String sheet, int r) {
	   int cc = 0;
	   try {
			FileInputStream fin = new FileInputStream(XLPATH);
			Workbook wb = WorkbookFactory.create(fin);
			cc = wb.getSheet(sheet).getRow(r).getLastCellNum();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   return cc;
   }
   
}
