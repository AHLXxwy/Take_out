package Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Food;

/**
 * Servlet implementation class UserList
 */
@WebServlet("/FoodList")
public class FoodList extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		//获取用户输入的查询的关键字
		String foodtype=request.getParameter("ftype");
		System.out.print(foodtype);
		//1.获取所有的食物的数据--》List
		try {
			
			List<Food> foods= FoodService.getAllFood(foodtype);
			//2.把数据转发到显示的jsp中
			request.setAttribute("foods",foods);
			
			RequestDispatcher rd1=request.getRequestDispatcher("/food.jsp");
			rd1.forward(request,response);
			
		} catch (ClassNotFoundException e) {
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
