package pack;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Forgot
 */
@WebServlet("/Forgot")
public class Forgot extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Forgot() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Connection conn = ConnectUtil.getJdbcConnect();
			String email=request.getParameter("email");
			String pass=request.getParameter("pass");
			PreparedStatement ps = conn.prepareStatement("update forgot set pass=? where email=?");
			ps.setString(2, email);
			ps.setString(1, pass);
			int i=ps.executeUpdate();
			if(i>0) {
				response.sendRedirect("update.jsp");
			}else {
				response.sendRedirect("error.jsp");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
