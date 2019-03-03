package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.ThanhvienDao;
import com.model.Thanhvien;

/**
 * Servlet implementation class ThanhvienServlet
 */
@WebServlet("/ThanhvienServlet")
public class ThanhvienServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
//		response.setContentType("text/html;charset=UTF-8");
//		List<Thanhvien> list = new ThanhvienDao().getAllThanhvien();
//		request.setAttribute("listV", list);
//		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	
		response.setContentType("text/html;charset=UTF-8");
		List<Thanhvien> list = new ThanhvienDao().getAllThanhvien();
		request.setAttribute("listV", list);
		request.getRequestDispatcher("index.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
