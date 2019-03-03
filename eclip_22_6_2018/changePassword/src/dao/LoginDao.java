package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import com.model.LoginModel;
import com.util.ConnectUtil;

public class LoginDao {
	
	public boolean updateLogin(LoginModel l) {
		boolean bl = false;
		Connection con;
		PreparedStatement ps = null;
		con=ConnectUtil.getJdbcConnect();
		try {
			ps=con.prepareStatement("update login set currentpass=? where id=? and currentpass=? ");
			ps.setString(1, l.getCurrentpass());
			ps.setInt(2, l.getId());
			ps.setString(3, l.getCurrentpass());
			int i=ps.executeUpdate();
			if(i>0) {
				bl=true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
		}
		return bl;
	}
}
