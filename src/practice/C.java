package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class C {
public static void main(String[] args) throws Exception {
	
	File src = new File("path");
	FileInputStream fis = new FileInputStream(src);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sh1 = wb.getSheetAt(0);
	
	File fout = new File("path");
	FileOutputStream fos = new FileOutputStream(fout);
	
	sh1.createRow(0).createCell(0).setCellValue("data we have to provide");
	wb.write(fos);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
