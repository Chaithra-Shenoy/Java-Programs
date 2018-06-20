/**
 * 
 */
package com.bridgelabz.StructuralDesignPattern.FacadeDesignPattern;

import java.sql.Connection;

/**
 * purpose
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class OracleHelper {
	public static Connection getOracleDbConnection() {
		System.out.println("\tgetting Oracle db Connection");
		return null;
	}
	public void generateOraclePDFReport(String tableName, Connection con) {
	tableName="Oracle";
	System.out.println(tableName+".pdf");
	}

	public void generateOracleHTMLReport(String tableName, Connection con) {
		tableName="server";
		System.out.println(tableName+".html");
	} 

}
