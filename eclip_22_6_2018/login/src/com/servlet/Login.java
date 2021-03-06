package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.LoginDao;
import com.model.LoginModel;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
        session.removeAttribute("user");
        response.sendRedirect("login.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 		String username= request.getParameter("username");
		String password = request.getParameter("password");
		String command = request.getParameter("command");
		HttpSession session = request.getSession();
		
		switch (command) {
		case"login":
			LoginModel lg = new LoginModel();
			lg=LoginDao.Login(request.getParameter("username"), request.getParameter("password"));
			if(lg!=null){
	            session.setAttribute("user", lg);
	            request.getRequestDispatcher("trangchu.jsp").include(request, response); 
	        }
	        else{
	             request.setAttribute("error", "error email or password");
	             request.getRequestDispatcher("error.jsp").include(request, response); 
	        }
			break;
			
		default:
			break;
		}
		
	}

}
