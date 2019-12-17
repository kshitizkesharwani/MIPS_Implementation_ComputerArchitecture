package computer_architecture_mips_implementation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadXLS {



	public static void main(String[] args) throws IOException {
		List list = getInstructions("C:/Study/MastersofComputerScience/ComputerArchitecture/Instructions.xls");

		Decision d = new Decision(); 

		List analysisList = new ArrayList();
		analysisList = d.makeDecision(list);


		WriteXLS write = new WriteXLS();

		WriteXLS.writeExel(analysisList);





	}
	public static List getInstructions(String filePath) {
		List instList = new ArrayList();
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(filePath);

			// Using XSSF for xlsx format, for xls use HSSF
			Workbook workbook = new HSSFWorkbook(fis);

			int numberOfSheets = workbook.getNumberOfSheets();

			//looping over each workbook sheet
			for (int i = 0; i < numberOfSheets; i++) {
				Sheet sheet = workbook.getSheetAt(i);
				Iterator rowIterator =  sheet.iterator();

				//iterating over each row
				while (rowIterator.hasNext()) {

					Instructions inst = new Instructions();
					Row row = (Row) rowIterator.next();
					Iterator cellIterator = row.cellIterator();

					//Iterating over each cell (column wise)  in a particular row.
					while (cellIterator.hasNext()) {

						Cell cell = (Cell) cellIterator.next();
						//The Cell Containing String will is name.
						if (Cell.CELL_TYPE_STRING == cell.getCellType()) {
							if (cell.getColumnIndex() == 0) {

								inst.setInstName((cell.getStringCellValue()));
								/* System.out.print(inst.getInstName()); */
							}

							else if (cell.getColumnIndex() == 1) {
								inst.setReg1(cell.getStringCellValue());
								/* System.out.print("               " + inst.getReg1()); */
							}
							//Cell with index 2 contains marks in Science
							else if (cell.getColumnIndex() == 2) {
								inst.setReg2(cell.getStringCellValue());
								/*
								 * System.out.print("               " + inst.getReg2()); System.out.println();
								 */
							}


						} 
					}
					instList.add(inst);

				}
			}

			fis.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return instList;
	}

}

