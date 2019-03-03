package pack;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Reg
 */
@WebServlet("/Reg")
public class Reg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		try {
			Connection con =ConnectUtil.getJdbcConnect();
			String uname=request.getParameter("uname");
			String diachi=request.getParameter("diachi");
			String email=request.getParameter("email");
			String pass=request.getParameter("pass");
			String s="select email from forgot where email='"+email+"'";
			PreparedStatement ps1=con.prepareStatement(s);
			ResultSet rs=ps1.executeQuery();
			if(rs.next()) {
				
				request.setAttribute("status", "Add product failed!");
				request.getRequestDispatcher("index.jsp").forward(request, response);
				
//				request.setAttribute("message", "ban da bi trung email");
//				response.sendRedirect("index.jsp");
			}
			else {
			    PreparedStatement ps=con.prepareStatement("insert into forgot1 values(?,?,?,?,?)");
				ps.setString(1, uname);
				ps.setString(2, diachi);
				ps.setString(3, email);
				ps.setString(4, pass);
				Timestamp timestamp = new Timestamp(System.currentTimeMillis());
				ps.setTimestamp(5, timestamp);
				int i=ps.executeUpdate();
				if(i>0) {
					response.sendRedirect("welcome.jsp");
				}else {
					response.sendRedirect("error.jsp");
				}
			}
		} catch (Exception e) {
			System.out.println("loi "+e.getMessage());
		}
	}

}
