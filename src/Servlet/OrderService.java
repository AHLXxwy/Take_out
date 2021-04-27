package Servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import entity.Food;
import entity.Order;
import entity.Shopping;
import entity.TUser;

public class OrderService {
	// ��ȡ���ݿ�����
		public static Connection getConnect() throws ClassNotFoundException {
			// ע������
			Class.forName("com.mysql.jdbc.Driver");
			// ��������
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
		// ��ȡ���еĿͻ�ѡ����Ϣ������Ϣ
				public static List<Order> getAllOrder() throws ClassNotFoundException {
					// ��ȡ���ݿ�����
					Connection conn = getConnect();
					// 1.����QueryRunner����
					QueryRunner runner = new QueryRunner();
					String sql6 = "select food.fname,food.fprice,food.ftime,food.fimgsrc,customer.cname,customer.caddress,customer.cphone from food, customer,shopping where food.fname=shopping.fname and shopping.cname=customer.cname";
					List<Order> orders = null;
					try {

						orders = runner.query(conn, sql6, new BeanListHandler<Order>(Order.class));
						DbUtils.closeQuietly(conn);
						

					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					return orders;
				}

}
