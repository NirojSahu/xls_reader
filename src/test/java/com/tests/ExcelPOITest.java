package com.tests;

import java.util.Arrays;

import com.navlabs.excel.reader.NALExcelXLSReader;

public class ExcelPOITest {

	public static void main(String[] args) {
		NALExcelXLSReader reader = new NALExcelXLSReader("testdata.xlsx");
		int col = reader.getColumnCount("register");
//		System.out.println(col);
		
		String cell = reader.getCellData("register", "firstname", 3);
		System.out.println(cell);
		
//		reader.addSheet("naveen2");
//		reader.addColumn("naveen2","Testing");
//		reader.setCellData("naveen2","Testing",3,"TestingVal1");
//		System.out.println(reader.getCellData("naveen2",1,1));
//		Object data[][] = reader.getSheetData("register");
//		System.out.println(Arrays.deepToString(data));
	}

}
