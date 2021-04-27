package Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entity.Food;

/**
 * Servlet implementation class ShoppingServlet
 */
@WebServlet("/ShoppingList")
public class ShoppingList extends HttpServlet {
	private static final long serialVersionUID = 1L;
    

	/**
	 * @param shoppings 
	 * @throws IOException 
	 * @throws ServletException 
	 * @throws ClassNotFoundException 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
					List<Food> shoppings1 = null;
					List<Food> foods=null;
					String foodtype=request.getParameter("ftype");
					HttpSession session = request.getSession();
					String username = (String) session.getAttribute("username");
					
					
					try {
						shoppings1 = ShoppingService.getAllShopping(username);
						foods= FoodService.getAllFood(foodtype);
						
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					//2.把数据转发到显示的jsp中
					request.setAttribute("shoppings1",shoppings1);
					request.setAttribute("foods",foods);
					
					//2.把数据转发到显示的jsp中
					
//					
					RequestDispatcher rd =request.getRequestDispatcher("/food.jsp");
					rd.forward(request,response);
				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
