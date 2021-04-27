package Servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import entity.Food;

//�����࣬����ҵ���߼�
public class FoodService {
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

	public static void addFood() {

	}

	
	// ��ȡ���е�ʳ������
	public static List<Food> getAllFood(String foodtype)throws ClassNotFoundException {
		// ��ȡ���ݿ�����
		Connection conn = getConnect();
		// 1.����QueryRunner����
		QueryRunner runner = new QueryRunner();
		
		String sql1 = "select * from food where ftype=?";
		List<Food> foods = null;
		try {
			
			foods = runner.query(conn, sql1, new BeanListHandler<Food>(Food.class),foodtype);
			DbUtils.closeQuietly(conn);
			

		} catch (SQLException e) {   
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return foods;
	}

	// ��ѯʳ��
	public static List<Food> queryFoods(String key) throws ClassNotFoundException {
		// ��ȡ���ݿ�����
		Connection conn = getConnect();
		// 1.����QueryRunner����
		QueryRunner runner = new QueryRunner();
		System.out.println(key);
		key = "%" + key + "%";
		String sql1 = "select * from food where fname like ? or ftype like ?";
		List<Food> foods = null;
		try {

			foods = runner.query(conn, sql1, new BeanListHandler<Food>(Food.class), key, key);
			DbUtils.closeQuietly(conn);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return foods;
	}
	
}
