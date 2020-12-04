package org.project.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataUtilities {
	
	@DataProvider
    public Object[][] getData(Method m) throws IOException{
		
		File f =new File("./src/test/resources/excelfiles/TestData.xlsx");
		FileInputStream fis = new FileInputStream(f);
		try (Workbook wb = new XSSFWorkbook(fis)) {
			Sheet sh =wb.getSheet(m.getName());
			
			int totalrows = sh.getPhysicalNumberOfRows();
			int totalcells = sh.getRow(0).getLastCellNum();
			
			Object[][]data=new Object[totalrows-1][totalcells];
			
			for(int i=1; i<totalrows; i++) {
				
				for(int j=0; j<totalcells; j++) {
					
					data[i-1][j]= sh.getRow(i).getCell(j).getStringCellValue();
					
				}
				
			}
			return data;
		}
	
	
}

}
