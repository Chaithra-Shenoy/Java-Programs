/**
 * 
 */
package com.bridgelabz.objectOrientedProgram.commercialDataProcessing;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.parser.ParseException;

/**
 * purpose The StockAccount class maintains a list of CompanyShares object
 * which has Stock Symbol and Number of Shares as well as DateTime of the
 * transaction. When buy or sell is initiated StockAccount checks if
 * CompanyShares are available and accordingly update or create an Object.
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class StockManager {
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		StockManager companyManager = new StockManager();
		companyManager.askUser();
	}

	/**
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws ParseException
	 */
	public void askUser() throws FileNotFoundException, IOException, ParseException {
		Scanner scanner = new Scanner(System.in);
		StockData stockData = new StockData();
		System.out.println("\n Enter your name:");
		String name = scanner.next();
		System.out.println("Enter the file name");
		String filename = scanner.next();
		String path = "/home/administrator/Java/MyJava/src/com/bridgelabz/objectOrientedProgram/commercialDataProcessing/"
				+ filename;
		stockData.createNewFile(path);

		System.out.println("what do you want to perform?");
		System.out.println("1.Buy stock??");
		System.out.println("2. Sell stock??");
		System.out.println("3. Quit");
		int choice = scanner.nextInt();

		String filePath = "/home/administrator/Java/MyJava/src/com/bridgelabz/objectOrientedProgram/commercialDataProcessing/StockAccount.json";
		switch (choice) {
		case 1:
			stockData.printEntries(filePath);
			System.out.println("Which symbol do you want to buy?");
			String symbol = scanner.next();
			System.out.println("How much amount you have?");
			int amount = scanner.nextInt();
			stockData.buy(amount, symbol, filePath, path);
			askUser();
			break;
		case 2:

			stockData.sell(filePath, path);
			askUser();
			break;
		default:
			break;
		}
	}
}
