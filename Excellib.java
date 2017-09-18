package com.Generallibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excellib 
{
	String path="C:\\Users\\Jomi\\Desktop\\testData.xlsx";
	
	public String getexceldata(String sheetname,int rownum,int cellnum) throws Throwable
	{
	FileInputStream fis=new FileInputStream(path);
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh=wb.getSheet(sheetname);
	Row row=sh.getRow(rownum);
	String data=row.getCell(cellnum).getStringCellValue();
	
	wb.close();
	return data;
	
	
}
}
