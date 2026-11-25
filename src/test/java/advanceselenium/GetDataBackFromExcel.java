package advanceselenium;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.microsoft.schemas.office.visio.x2012.main.CellType;

public class GetDataBackFromExcel {
	
	public void setDataIntoExcel(String sheetName, int rowNum, int cellNum, String data,CellType type)throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./testData/VTiger_CRM_TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheetName).getRow(rowNum).createCell(cellNum, type).setCellValue(data);
		

		FileOutputStream fos = new FileOutputStream("./testData/VTiger_CRM_TestData.xlsx");
		wb.write(fos);
		wb.close();
	}

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		GetDataBackFromExcel xutil= new GetDataBackFromExcel();
		xutil.setDataIntoExcel("Contact", 0, 15, "Status", CellType.STRING);
	}

}
