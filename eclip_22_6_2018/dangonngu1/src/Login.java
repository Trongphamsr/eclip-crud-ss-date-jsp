

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	
//	danh dach cac ngon ngu https://www.roseindia.net/tutorials/I18N/locales-list.shtml
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String lang= request.getParameter("lang");
		//System.out.println(lang);
		request.setAttribute("lang", lang);
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}

}