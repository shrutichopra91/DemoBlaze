package GenericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class BlazeMsExcelAutomation 
{
	public static String getExcelData(String sheetName, int rowNum, int cellNum) throws IOException
	{
		FileInputStream fis = new FileInputStream(BlazeConstants.filepath);
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet(sheetName);
		XSSFRow row = sheet.getRow(rowNum);
		String data = row.getCell(cellNum).getStringCellValue();
		return data;
	}
}

