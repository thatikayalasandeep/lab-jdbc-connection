package controller;

import java.sql.*;
import utility.ConnectionManager;

public class Main {
	
	public static void main(String args[]) throws Exception{
		Connection con;
		ConnectionManager cm=new ConnectionManager();
		con=cm.getConnection();
		
		if(con!=null) {
			System.out.println("Connection established");
		}
		else {
			System.out.println("Check your connection");
			
		}
	}
}
