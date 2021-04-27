package Servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.dbutils.QueryRunner;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stubetInitParameter("username");
		String password =request.getParameter("password");
		String username=request.getParameter("username");
		 //TUser u=UserService.login(username, password);
		//if(u!=null)
		System.out.println(username);
		System.out.println(password);
		
		try {
			if(UserService.login(username, password) != null){
				HttpSession session =request.getSession();
				session.setAttribute("username",username );
				RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
				rd.forward(request,response);
			}
			else{
				//转发
				
			//response.getWriter().append("Served at: ").append(request.getContextPath());
				
				
				request.setAttribute("info","用户名或密码错误");
				RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
				rd.forward(request,response);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
