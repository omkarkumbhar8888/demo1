package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData1 {

	public static void readData() throws IOException {
		String path = System.getProperty("user.dir") + "\\a.xlsx";
		File src = new File(path);

		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh1 = wb.getSheetAt(0);

		DataFormatter df = new DataFormatter();
		String a = df.formatCellValue(sh1.getRow(0).getCell(0));
		System.out.println(a);
	}

	public static void writeData() throws IOException {
		String path = System.getProperty("user.dir") + "\\a.xlsx";
		File src = new File(path);
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh1 = wb.getSheetAt(0);
		File out = new File(path);
		FileOutputStream fos = new FileOutputStream(out);

		sh1.createRow(5).createCell(5).setCellValue("5 row 5 coloumn");

		wb.write(fos);

	}

	public static void main(String[] args) throws IOException {
		readData();
		writeData();
	}
}
