//package mvcdemo.controllers;
//
//import java.io.IOException;
//
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import mvcdemo.model.Authenticator;
//import mvcdemo.model.User;
//
////import sun.text.normalizer.ICUBinary.Authenticate;
////import java.text.Normalizer;
///**
// * Servlet implementation class LoginController
// */
////@WebServlet("/LoginController")
//
//public class LoginController extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//
//    /**
//     * Default constructor. 
//     */
//    public LoginController() {
//        // TODO Auto-generated constructor stub
//    	super();
//    }
//    
//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//		
//		RequestDispatcher rd = null;
//		rd = request.getRequestDispatcher("/login.jsp");
//		rd.forward(request, response);
//		
//	}
//
//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//	 */
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//			 
//		String username = request.getParameter("username");
//		String password = request.getParameter("password");
//		RequestDispatcher rd = null;
// 
//		Authenticator authenticator = new Authenticator();
//		String result = authenticator.authenticate(username, password);
//		if (result.equals("success")) {
//			rd = request.getRequestDispatcher("/success.jsp");
//			User user = new User(username, password);
//			request.setAttribute("user", user);
//		} else {
//			rd = request.getRequestDispatcher("/error.jsp");
//		}
//		rd.forward(request, response);
//	}
//
//}


package mvcdemo.controllers;
 
import java.io.IOException;
 
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// for Crunchify example

import java.io.PrintWriter;
 
import mvcdemo.model.Authenticator;
import mvcdemo.model.User;
 
//import sun.text.normalizer.ICUBinary.Authenticate;
 
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	public LoginController() {
		super();
	}
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		RequestDispatcher rd = null;
 
		Authenticator authenticator = new Authenticator();
		String result = authenticator.authenticate(username, password);
		if (result.equals("success")) {
			rd = request.getRequestDispatcher("/success.jsp");
			User user = new User(username, password);
			request.setAttribute("user", user);
		} else {
			rd = request.getRequestDispatcher("/error.jsp");
		}
		rd.forward(request, response);
	}
 
}