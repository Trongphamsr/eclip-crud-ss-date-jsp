package controller.admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AccountController
 */
@WebServlet("/admin/account")
public class AccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccountController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if(action==null)
			request.getRequestDispatcher("login.jsp").forward(request, response);
		else if(action.equalsIgnoreCase("logout")) {
			HttpSession session=request.getSession();
			session.removeAttribute("username");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}else if(action.equalsIgnoreCase("logout1")) {
			HttpSession session=request.getSession();
			session.removeAttribute("username");
			request.getRequestDispatcher("").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username= request.getParameter("username");
		String password= request.getParameter("password");
		String role= request.getParameter("role");
		if(username.equalsIgnoreCase("admin")&&password.equalsIgnoreCase("123")&&role.equalsIgnoreCase("1")) {
			HttpSession session = request.getSession();
			session.setAttribute("username", username);
			request.getRequestDispatcher("listProduct.jsp").forward(request, response);
		}else {
			HttpSession session = request.getSession();
			session.setAttribute("username", username);
			request.setAttribute("message", "ban khong the truy cap vao trang chu cua chung toi");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

}
