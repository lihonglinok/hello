package map;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * ���ݿ����ӹ�����
 * @author lihonglin
 *
 */
public class DBUtil {
	private static String driver="com.mysql.jdbc.Driver";
	private static String url="jdbc:mysql//localhost:3306/store";
	private static String username="root";
	private static String password="";
	
	static {
		try {
			//ע������
			Class.forName(driver);
			Connection conn=DriverManager.getConnection(url, username, password);
			conn.prepareStatement("select * from item");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
	}
}
