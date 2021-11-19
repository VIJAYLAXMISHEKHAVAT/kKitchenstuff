package Utlities;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excel_Data {
	public static FileInputStream fis;
	public static File fpath;

	@Test
	public static void GettingExcelData() throws Exception {
		File fpath = new File("D:\\Programs\\8'30PMEST Batch\\FinalProject\\Excel\\Excel.xlsx");
		//boolean file = fpath.exists();
		//System.out.println(file);
		FileInputStream fis = new FileInputStream(fpath);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		int rowcount = sheet.getLastRowNum();
		System.out.println(rowcount);
		int cellcount = sheet.getRow(0).getLastCellNum();
		System.out.println(cellcount);
		for (int i = 0; i < rowcount; i++) {
			XSSFRow row = sheet.getRow(i);
			
			for (int j = 0; j < cellcount; j++) {
				String rowvalue = row.getCell(j).toString();
				System.out.print("  "+rowvalue);
			}
			System.out.println();
		}
		fis.close();

	}
}
