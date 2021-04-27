package Servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import entity.Food;
import entity.Shopping;
import entity.TUser;


public class ShoppingService {
	// 获取数据库连接
		public static Connection getConnect() throws ClassNotFoundException {
			// 注册驱动
			Class.forName("com.mysql.jdbc.Driver");
			// 建立连接
			String url = "JDBC:mysql://localhost:3306/take_out?useUnicode=true&characterEncoding=UTF-8";
			String user = "root";
			String pd = "99652623";

			try {
				Connection conn = DriverManager.getConnection(url, "root", "99652623");
				return conn;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;

		}
		//加入购物车
		public static void addShopping(String fname,String cname,String ftype) throws ClassNotFoundException {
			Connection conn = getConnect();
			QueryRunner runner = new QueryRunner();
			String sql4 = "insert into shopping(fname,cname,ftype) values(?,?,?)";
			
			try {
				runner.execute(conn, sql4, fname,cname,ftype);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// 获取客户所有的选购信息
		public static List<Food> getAllShopping(String username) throws ClassNotFoundException {
			// 获取数据库连接
			Connection conn = getConnect();
			// 1.创建QueryRunner对象
			QueryRunner runner = new QueryRunner();
			String sql5 = "select food.fimgsrc,food.fname,food.fprice,food.ftime,customer.cname,customer.caddress,customer.cphone from food, customer,shopping where shopping.cname=? and food.fname=shopping.fname and shopping.cname=customer.cname";
			List<Food> shoppings1 = null;
			try {

				shoppings1 = runner.query(conn, sql5, new BeanListHandler<Food>(Food.class),username);
				DbUtils.closeQuietly(conn);
				

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			return shoppings1;
		}

}
