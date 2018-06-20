package com.bridgelabz;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

public class RollBackExample {
	public static void main(String args[]){  
		try{  
		  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");  
		con.setAutoCommit(false);  
		  
		PreparedStatement ps=con.prepareStatement("insert into bridgelabz.batch values(?,?,?)");  
		  
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
		while(true){  
		  
		System.out.println("enter id");  
		String s1=br.readLine();  
		int id=Integer.parseInt(s1);  
		  
		System.out.println("enter name");  
		String name=br.readLine();  
		  
		System.out.println("enter barnch");  
		String branch=br.readLine();  
		 
		  
		ps.setInt(1,id);  
		ps.setString(2,name);  
		ps.setString(3,branch);  
		ps.executeUpdate();  
		 Savepoint point=con.setSavepoint("point");
			
			
		System.out.println("commit/rollback");  
		String answer=br.readLine();  
		if(answer.equals("commit")){  
		con.commit();  
		}  
		if(answer.equals("rollback")){  
		con.rollback(point);
		}  
		  
		  
		System.out.println("Want to add more records y/n");  
		String ans=br.readLine();  
		if(ans.equals("n")){  
		break;  
		}  
		  
		}  
		con.commit();  
		System.out.println("record successfully saved");  

		con.close();//before closing connection commit() is called  
		}catch(Exception e){System.out.println(e);}  
		  
		}
}
