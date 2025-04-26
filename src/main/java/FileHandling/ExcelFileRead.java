package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileRead {
	
	String filePath=System.getProperty("user.dir")+"\\Input\\FitaData.xlsx";
	
	public void ReadExcel() throws IOException
	{
		//File F = new File(filePath);
		FileInputStream Fs = new FileInputStream(filePath);
		XSSFWorkbook workbook = new XSSFWorkbook(Fs);
		Sheet sheet = workbook.getSheet("StudentInfo");// move to the specific sheet
		int totalRows =sheet.getPhysicalNumberOfRows(); // get the total number of used rows
		for(int i=0;i<totalRows;i++)  // iterate for each row
		{
			Row row =sheet.getRow(i); /// move in to a specific Row
			int totalColumn = row.getLastCellNum(); // Get total used column in that row
			for(int j=0;j<totalColumn;j++) // iterate for each column
			{
				Cell cell =row.getCell(j); // move in to specific cell
				System.out.print(getValue(cell)); // get the cell value according to the dataType
				System.out.print("\t");
			}
			System.out.println("");
		}
		workbook.close();
		Fs.close();
		
	}
	
	public Object getValue(Cell cellValue)
	{
		//System.out.println(cellValue.getCellType());
		if(cellValue.getCellType().toString().equals("STRING"))
		{
			return cellValue.getStringCellValue();
		}
		else if (cellValue.getCellType().toString().equals("NUMERIC"))
		{
			DataFormatter data =  new DataFormatter();
			return data.formatCellValue(cellValue);
			//return cellValue.getNumericCellValue();
		}
		return null;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ExcelFileRead E = new ExcelFileRead();
		E.ReadExcel();
	}

}
