package testPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelStringNumeric {

	public static void main(String[] args) {
		try {
			File src = new File("C:\\Users\\lajish.lakshmanan\\Downloads\\inputdata.xlsx");
			FileInputStream fis = new FileInputStream(src);
			
			@SuppressWarnings("resource")
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sh1 = wb.getSheetAt(0);			 
			System.out.println(sh1.getRow(0).getCell(0).getStringCellValue());
			System.out.println(sh1.getRow(0).getCell(1).getStringCellValue());
			System.out.println(sh1.getRow(1).getCell(0).getStringCellValue());
			System.out.println(sh1.getRow(1).getCell(1).getStringCellValue());
			System.out.println(sh1.getRow(2).getCell(0).getStringCellValue());
			System.out.println(sh1.getRow(2).getCell(1).getStringCellValue());
			System.out.println(sh1.getRow(3).getCell(0).getStringCellValue());
			System.out.println(sh1.getRow(3).getCell(1).toString());
			
			FileOutputStream fout = new FileOutputStream(new File("C:\\Users\\lajish.lakshmanan\\Downloads\\inputdata.xlsx"));
			wb.write(fout);
			fout.close();
			} catch (Exception e) {
			System.out.println(e.getMessage());
			}
		}
	}


