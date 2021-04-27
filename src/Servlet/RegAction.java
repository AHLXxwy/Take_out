package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 注册处理Servlet
 */
@WebServlet("/RegAction")
public class RegAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
  
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//请求
		request.setCharacterEncoding("utf-8");
		//用户名
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String caddress=request.getParameter("caddress");
		String cphone=request.getParameter("cphone");
		
		try {
			UserService.addUser(username,password,caddress,cphone);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//响应
		response.setCharacterEncoding("utf-8");
		request.setAttribute("username", username);
		request.setAttribute("password", password);
		request.setAttribute("caddress", caddress);
		request.setAttribute("cphone", cphone);
		request.getRequestDispatcher("regsuccess.jsp").forward(request,response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
