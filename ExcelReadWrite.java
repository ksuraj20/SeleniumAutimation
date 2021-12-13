package excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceloperation
	{

		private static final String username = null;
		// Common variables
		public FileInputStream fi;
		public FileOutputStream fo;
		public XSSFWorkbook workbook;
		public XSSFSheet sheet;
		public XSSFRow row;
		public XSSFCell cell;
		public CellStyle style;
		String path = null;
		String testcasename = username;

		public Exceloperation(String path) //To provide Exacel path
			{
				this.path = path;
			}

		// To get row count
		public int getRowCount(String sheetname) throws IOException // Extract number of rows
			{
				fi = new FileInputStream(path);
				workbook = new XSSFWorkbook(fi);
				sheet = workbook.getSheet(sheetname);
				int rowcount = sheet.getLastRowNum();
				workbook.close();
				fi.close();
				return rowcount;
			}

		// To get Column count
		public int getCellCount(String sheetname, int rownum) throws IOException // Extract number of cells
			{
				fi = new FileInputStream(path);
				workbook = new XSSFWorkbook(fi);
				sheet = workbook.getSheet(sheetname);
				row = sheet.getRow(rownum);
				int cellcount = row.getLastCellNum();
				workbook.close();
				fi.close();
				return cellcount;
			}

		// To get or read the data from excel file
		public String getCellData(String sheetname, int rownum, int colnum) throws IOException
			{
				fi = new FileInputStream(path);
				workbook = new XSSFWorkbook(fi);
				sheet = workbook.getSheet(sheetname);
				row = sheet.getRow(rownum);
				@SuppressWarnings("unused")
				int cellcount = row.getLastCellNum();
				cell = row.getCell(colnum);

				DataFormatter formatter = new DataFormatter();
				String data;
				try
					{
						data = formatter.formatCellValue(cell); // Return the cell data as String
						System.out.println(cell);
					} catch (Exception e)
					{
						data = "";
					}
				workbook.close();
				fi.close();
				return data;

			}

		

		// Update result in sheet OR Write pass or fail in excel sheet
		
		public void updateResult(String sheetname, int rownum, int colnum, String result) throws IOException
			{

				fi = new FileInputStream(path);
				workbook = new XSSFWorkbook(fi);
				sheet = workbook.getSheet(sheetname);

				row = sheet.getRow(rownum);
				cell = row.createCell(colnum);
				cell.setCellValue(result);

				fo = new FileOutputStream(path);
				workbook.write(fo);
				workbook.close();
				fi.close();
				fo.close();
							
			}

		public String datadriven(String string, int i, int j)
			{

				return null;
			}
	}
