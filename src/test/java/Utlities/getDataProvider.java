package Utlities;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class getDataProvider {
	DataFormatter df =new DataFormatter();
	@Test(dataProvider = "drivetest")
	
	public void Method(String EmailId,String Password)
	{
		System.out.println(EmailId);
		System.out.println(Password);
	}
	
	@DataProvider(name = "drivetest")
	public Object[][]abc() throws Exception  
	{
		FileInputStream fis = new FileInputStream("D:\\Programs\\8'30PMEST Batch\\FinalProject\\Excel\\Excel.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);		
		int rowcount = sheet.getLastRowNum();
		//System.out.println(rowcount);
		int cellcount = sheet.getRow(0).getLastCellNum();
		//System.out.println(cellcount);
		Object data[][]=new Object[ rowcount-1][cellcount];
		for (int i = 0;i< rowcount-1; i++) {
			XSSFRow row = sheet.getRow(i+1);			
			for (int j = 0;j< cellcount; j++) {
				XSSFCell cell= row.getCell(j);
				
				//System.out.println(cell);
				data[i][j]=df.formatCellValue(cell);
		       //System.out.println(row.getCell(j));
			}
			System.out.println();
		}
		fis.close();
		return data;
		
	
	}}
