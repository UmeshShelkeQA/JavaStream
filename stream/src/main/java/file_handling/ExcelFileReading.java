package file_handling;

import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileReading {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/main/resources/data/test_data.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("UserLoginDetails");

		int rows = sheet.getLastRowNum();
		int columns = sheet.getRow(0).getLastCellNum();
		System.out.println("Number Of Rows : "+ rows );
		System.out.println("Number Of Columns : "+ columns);
		System.out.println("============================================");
		//reading data from sheet1
		for(int i=0; i<=rows;i++) {
			Row row=sheet.getRow(i);
			for(int j=0;j<row.getLastCellNum();j++) {
				Cell cell = row.getCell(j);
				if(cell != null) {
//					System.out.print(cell.toString()+" ");
					CellType cellType = cell.getCellType();
					if(cellType == CellType.STRING) {
						System.out.print(cell.getStringCellValue() + " ");
					}else if(cellType == CellType.NUMERIC) {
//						DataFormatter dataFormatter = new DataFormatter();
//				        String value = dataFormatter.formatCellValue(cell);
//				        System.out.print(value + " ");
				        
//						cell.setCellType(CellType.STRING);
//						System.out.print(cell.getStringCellValue() + " ");
				        
				        System.out.print(new BigDecimal(cell.getNumericCellValue()).toString() + " ");
					}else if(cellType == CellType.BOOLEAN) {
						System.out.print(cell.getBooleanCellValue() + " ");
					}	
				}else {
					System.out.print("------ ");
				}
			}
			System.out.println();
		}
		
		workbook.close();
	}

}
