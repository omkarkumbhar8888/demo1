package testng1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class Dpclass {
	@DataProvider(name = "insertdata")
	public static String[][] dptest() throws IOException {
		String path = System.getProperty("user.dir") + "\\test data 1.xlsx";
		File src = new File(path);
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh1 = wb.getSheetAt(0);

		int row = sh1.getLastRowNum();
		System.out.println(row);
		int column = sh1.getRow(0).getLastCellNum();
		System.out.println(column);

		String data[][] = new String[row + 1][column];
		for (int i = 0; i < (row + 1); i++) {
			for (int j = 0; j < column; j++) {

				data[i][j] = sh1.getRow(i).getCell(j).getStringCellValue();

			}
		}
		return data;
	}

	public static void main(String[] args) throws IOException {
		dptest();
	}

}
