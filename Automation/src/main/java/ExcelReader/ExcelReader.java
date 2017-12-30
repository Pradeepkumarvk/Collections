package ExcelReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import testbase.Testbase;

public class ExcelReader extends Testbase {
Logger log=Logger.getLogger(ExcelReader.class.getName());
	String path;
	FileInputStream fs;
	XSSFWorkbook wb;
	XSSFSheet sh;
	
	public ExcelReader(String path) throws IOException
	{
		this.path=path;
		try {
			 fs=new FileInputStream(path);
			wb=new XSSFWorkbook(fs);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


public String[][] getdatafromexcel(String excelname, String Sheetname)
{
	String [][]datastrings=null;
	try
	{
	
	sh=wb.getSheet(Sheetname);
	
	int rownum=sh.getLastRowNum()+1;
	int colnum=sh.getRow(0).getLastCellNum();
	
	
	datastrings=new String[rownum-1][colnum];
	
	for (int i=1;i<rownum;i++)
	{
		XSSFRow row=sh.getRow(i);
		
		for (int j=0;j<colnum;j++)
		{
			XSSFCell cell=row.getCell(j);
			
			if (cell.getCellType()==cell.CELL_TYPE_STRING)
			{
				datastrings[i-1][j]=cell.getStringCellValue();
			}
			else if (cell.getCellType()==cell.CELL_TYPE_BOOLEAN)
			{
				String data=String.valueOf(cell.getBooleanCellValue());
				datastrings[i-1][j]=data;
			}
			else if (cell.getCellType()==cell.CELL_TYPE_NUMERIC)
			{
				String data=String.valueOf(cell.getNumericCellValue());
				datastrings[i-1][j]=data;
			}
		}
	}
	
	}
	catch(Exception e)
	{
		e.printStackTrace();
		return datastrings;
	}
	return datastrings;
}

}
