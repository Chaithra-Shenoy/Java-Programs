/**
 * 
 */
package com.bridgelabz.StructuralDesignPattern.FacadeDesignPattern;

import java.sql.Connection;

/**
 * purpose
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class FacadeMain {
	public static void main(String[] args) {
		String tableName = "Employee";
		System.out.println("----------" + tableName + "---------");
		// generating MySql HTML report and Oracle PDF report without using Facade
		Connection con = MySql.getMySqlDbConnection();
		MySql mySqlHelper = new MySql();
		mySqlHelper.generateMySqlHTMLReport(tableName, con);
		mySqlHelper.generateMySqlPDFReport(tableName, con);

		Connection con1 = OracleHelper.getOracleDbConnection();
		OracleHelper oracleHelper = new OracleHelper();
		oracleHelper.generateOraclePDFReport(tableName, con1);
		oracleHelper.generateOracleHTMLReport(tableName, con1);

		// generating MySql HTML report and Oracle PDF report using Facade
		FacadeHelper.generateReport(FacadeHelper.DBTypes.MYSQL, FacadeHelper.ReportTypes.HTML, tableName);
		FacadeHelper.generateReport(FacadeHelper.DBTypes.MYSQL,FacadeHelper.ReportTypes.PDF, tableName);
		FacadeHelper.generateReport(FacadeHelper.DBTypes.ORACLE, FacadeHelper.ReportTypes.PDF, tableName);
		FacadeHelper.generateReport(FacadeHelper.DBTypes.ORACLE, FacadeHelper.ReportTypes.HTML, tableName);
	}

}
