package utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelsheet {

	XSSFWorkbook wb;
	public Excelsheet()  {
		
		File src =new File("D:\\CA\\Marriottbonvoy\\Excel\\Testdata.xlsx");
		try {
			FileInputStream fis = new FileInputStream(src);
			
			wb=new XSSFWorkbook(fis);
		} 
		 catch (Exception e) {
			 
			 System.out.println("Unable to read excel file" + e.getMessage());
		
		}
		
	}

	public String getStringData(String login,int row,int coloumn)
	{
	return wb.getSheet("login").getRow(row).getCell(coloumn).getStringCellValue();
	}

	
	
	
	public double getNumericData(String sheetName,int row,int coloumn)
	
	{
		return wb.getSheet(null).getRow(0).getCell(0).getNumericCellValue();
	}
}
