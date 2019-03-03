package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectUtil {
	
	public static Connection getJdbcConnect() {
		final String url="jdbc:mysql://localhost:3306/toeiconline";
		final String user="root";
		final String password="";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection(url, user, password);
			} catch (ClassNotFoundException e) {
				System.out.println("loi forname");
			e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("loi DriverManager"+ e.getMessage());
		}finally {
			
		}
		return null;
	}
	public static void main(String[] args) {
		Connection connection = getJdbcConnect();
		if(connection!=null) {
			System.out.println("ok");
		}else {
			System.out.println("no ok");
		}
	}
}
