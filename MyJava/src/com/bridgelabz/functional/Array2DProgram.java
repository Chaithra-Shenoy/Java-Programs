package com.bridgelabz.functional;

import com.bridgelabz.Utility.Utility;

public class Array2DProgram {
	static int ROWS = 0;
	static int COLUMNS = 0;
	public static void main(String[] args) {
		
		System.out.println("Enter the rows:");
		ROWS = Utility.scanner(ROWS);
		System.out.println("Enter the columns:");
		COLUMNS = Utility.scanner(COLUMNS);
		int[][] b = Utility.arrayInt(ROWS, COLUMNS);
		Utility.printArrayInt(b, ROWS, COLUMNS);
		double[][] c = Utility.arrayDouble(ROWS, COLUMNS);
		Utility.printArrayDouble(c, ROWS,COLUMNS);
		boolean[][] d = Utility.arrayBoolean(ROWS, COLUMNS);
		Utility.printArrayBoolean(d, ROWS, COLUMNS);
	}
}
