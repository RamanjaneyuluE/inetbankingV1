package com.inetbanking.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelReading {

  @Test
  
  void dataReadFromExcel() throws IOException {
	  
	  File file = new File("C:\\Users\\raelur\\Downloads\\Samfm.xlsx");
	  FileInputStream fr = new FileInputStream(file);
	  
	  XSSFWorkbook workbook = new XSSFWorkbook(fr);
	  XSSFSheet    sheet    = workbook.getSheet("Stock");
	  System.out.println(sheet.getLastRowNum());
	  System.out.println(sheet.getFirstRowNum());
	  int noOfColumns = sheet.getRow(1).getLastCellNum();
	  System.out.println("Number of columns:" + noOfColumns);
	  int j ;
	  for(int i=1;i<=sheet.getLastRowNum();i++) {
		  
		  for(j=0;j<noOfColumns;j++) 
		  {
		  
		  String code_value =   sheet.getRow(i).getCell(j).toString();
		  System.out.print(code_value + " ");
		  
		  //String label_value = sheet.getRow(i).getCell(j).getStringCellValue();
		  //System.out.println("Label" +  label_value );
		  
	  }
		  sheet.getRow(i).createCell(j).setCellValue("PASS");
		  System.out.println("");
		  
  }
	  
	  FileOutputStream fos = new FileOutputStream("C:\\Users\\raelur\\Downloads\\Samfm.xlsx");
	  workbook.write(fos);
}
  
}
