package computer_architecture_mips_implementation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.WorkbookDocument;

public class WriteXLS {


	public static void writeExel(List l) throws IOException {
		// Using XSSF for xlsx format, for xls use HSSF

		FileInputStream fis = null;
		fis = new FileInputStream("C:/Study/MastersofComputerScience/ComputerArchitecture/Instructions.xls");

		// Using XSSF for xlsx format, for xls use HSSF
		Workbook workbook = new HSSFWorkbook(fis);


		Sheet analysisSheet=workbook.createSheet("Analysis Report");
		List<Instructions> l1 = l;
		int rowIndex = 0;
		for (Instructions inst : l1)
		{
			Row row = analysisSheet.createRow(rowIndex++);
			int cellIndex = 0;
			//first place in row is name
			row.createCell(cellIndex++).setCellValue(inst.getInstName());

			//second place in row is marks in maths
			row.createCell(cellIndex++).setCellValue(inst.getReg1());

			//third place in row is marks in Science
			row.createCell(cellIndex++).setCellValue(inst.getReg2());

			//fourth place in row is marks in English
			row.createCell(cellIndex++).setCellValue(inst.getComments());

			

		}



		//write this workbook in excel file.
		try {
			FileOutputStream fos = new FileOutputStream("C:/Study/MastersofComputerScience/ComputerArchitecture/Instructions.xls");
			workbook.write(fos);
			fos.close();

			System.out.println("C:/Study/MastersofComputerScience/ComputerArchitecture/Instructions.xls" + " is successfully written");
			CreateTimingDiagram c = new CreateTimingDiagram();
			c.createDiagram(l);
			
			CreateTimingDiagramFU c1 = new CreateTimingDiagramFU();
			c1.createDiagram(l);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
