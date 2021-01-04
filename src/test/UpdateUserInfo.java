package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
//업데이트문
public class UpdateUserInfo {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		Connection con;
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "jtest", "ezen1234");

			Statement m = con.createStatement();
			String sql = "update user_info";
			sql += " set ui_num=3,";
			sql += " ui_name='하길동',";
			sql += " ui_id='ha',";
			sql += " ui_pwd='ha'";
			sql += "where ui_num=3";


			int v = m.executeUpdate(sql);
			System.out.println(v + "개");

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

}
