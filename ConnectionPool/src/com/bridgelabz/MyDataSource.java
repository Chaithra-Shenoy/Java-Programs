package com.bridgelabz;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import javax.sql.DataSource;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class MyDataSource {
	public static DataSource getMyDataSource() {
		Properties property = new Properties();
		FileInputStream file = null;
		MysqlDataSource mysqlData = null;
		try {
			file = new FileInputStream("/home/administrator/Java/ConnectionPool/src/com/bridgelabz/pool.properties");
			property.load(file);
			mysqlData = new MysqlDataSource();
			mysqlData.setURL(property.getProperty("MYSQL_URL"));
			mysqlData.setUser(property.getProperty("MYSQL_USERNAME"));
			mysqlData.setPassword(property.getProperty("MYSQL_PASSWORD"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return mysqlData;
	}
}
