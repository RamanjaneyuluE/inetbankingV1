package com.inetbanking.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLUtis {
	
	public static FileInputStream fi ;
	public static FileOutputStream fo ;
	public static XSSFWorkbook wb ;
	public static XSSFSheet ws ;
	public static XSSFRow row ;
	public static XSSFCell cell ;
	
	public static int getRowCount(String xlfile, String xlsheet) throws IOException  {
		
		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
	
		
		
		return 1;
		
		
	}
	

}
