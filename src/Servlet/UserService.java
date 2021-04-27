package Servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import entity.TUser;

//�����࣬����ҵ���߼�
public class UserService {
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

	public static void addUser() {

	}

	// �û���¼
	public static TUser login(String username, String password) throws SQLException, ClassNotFoundException {

		Connection conn = getConnect();
		// 1.����QueryRunner����
		QueryRunner runner = new QueryRunner();
		String sql1 = "select * from customer where cname = ? and password=?";
		List<TUser> users;
		try {
			users = runner.query(conn, sql1, new BeanListHandler<TUser>(TUser.class), username, password);
			if (users.size() > 0)
				return users.get(0);
			else
				return null;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DbUtils.closeQuietly(conn);
		return null;

	}

	// ��ȡ���е��û�����
	public static List<TUser> getAllUser() throws ClassNotFoundException {
		// ��ȡ���ݿ�����
		Connection conn = getConnect();
		// 1.����QueryRunner����
		QueryRunner runner = new QueryRunner();
		String sql1 = "select * from customer";
		List<TUser> users = null;
		try {

			users = runner.query(conn, sql1, new BeanListHandler<TUser>(TUser.class));
			DbUtils.closeQuietly(conn);
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return users;
	}
	//�û�ע��
	public static void addUser(String username,String password,String caddress,String cphone) throws ClassNotFoundException {
		// ��ȡ���ݿ�����
		Connection conn = getConnect();
		QueryRunner runner = new QueryRunner();
		String sql2= "insert into customer(cname,password,caddress,cphone)"+"values(?,?,?,?)";
		try {
			runner.execute(conn,sql2,username,password,caddress,cphone);
			System.out.print("insert");
		}catch(SQLException throwbales) {
			throwbales.printStackTrace();
		}
				
		
	}
	
	
	
}
