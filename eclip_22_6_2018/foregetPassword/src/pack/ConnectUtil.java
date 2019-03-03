package pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectUtil {
	
	public static Connection getJdbcConnect() {
//		final String url="jdbc:mysql://localhost:3306/toeiconline";
//		final String user="root";
//		final String password="";
		
		Connection con = null;
		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			return DriverManager.getConnection(url, user, password);
			
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con=DriverManager.getConnection("jdbc:sqlserver://localhost:52824;databaseName=vidu","sa","123456");
	
			} catch (ClassNotFoundException e) {
				System.out.println("loi forname " + e.getMessage());
			e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("loi DriverManager"+ e.getMessage());
		}finally {
			
		}
		return con;
	}
	
	public static void main(String[] args) {
		Connection con = getJdbcConnect();
		if(con!=null) {
			System.out.println("ok");
		}else {
			System.out.println("no ok");
		}
	}
}
