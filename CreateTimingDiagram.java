package computer_architecture_mips_implementation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class CreateTimingDiagram {

	int offset=0;

	public void createDiagram(List l) throws IOException {
		// Using XSSF for xlsx format, for xls use HSSF

		FileInputStream fis = null;
		fis = new FileInputStream("C:/Study/MastersofComputerScience/ComputerArchitecture/Instructions.xls");

		// Using XSSF for xlsx format, for xls use HSSF
		Workbook workbook = new HSSFWorkbook(fis);


		Sheet diagSheet=workbook.createSheet("TD without FU");
		List<Instructions> l1 = l;
		
		Row row1 = diagSheet.createRow(0);
		int cellnumber=2;
		row1.createCell(0).setCellValue(" Time");
		for ( int i = 1 ; i<20; i ++ ) {
			row1.createCell(cellnumber++).setCellValue(i);
		}

		int rowIndex = 1;
		for (Instructions inst : l1)
		{
			Row row = diagSheet.createRow(rowIndex++);


			int cellIndex = offset;


			cellIndex=cellIndex+rowIndex;
			row.createCell(cellIndex++).setCellValue("IF");
			if(inst.getNumStalls()>0)
			{cellIndex=cellIndex+inst.getNumStalls();
			offset=inst.getNumStalls()+offset;	

			}


			row.createCell(cellIndex++).setCellValue("D");
			row.createCell(cellIndex++).setCellValue("IE");
			row.createCell(cellIndex++).setCellValue("M");
			row.createCell(cellIndex++).setCellValue("WB");



		}



		//write this workbook in excel file.
		try {
			FileOutputStream fos = new FileOutputStream("C:/Study/MastersofComputerScience/ComputerArchitecture/Instructions.xls");
			workbook.write(fos);
			fos.close();

			System.out.println("C:/Study/MastersofComputerScience/ComputerArchitecture/Instructions.xls" + " is successfully written");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


}
