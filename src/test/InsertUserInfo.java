package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
//여러줄로 데이터구조만들기
public class InsertUserInfo {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		try {
			Connection con = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521/xe", "jtest", "ezen1234");

			Statement m = con.createStatement();
			String sql = "insert into user_info(ui_num,ui_name,ui_id,ui_pwd)";
			sql += "values(1,'홍길동','hong','hong')";
			String sql2 = "insert into user_info(ui_num,ui_name,ui_id,ui_pwd)";
			sql2 += "values(2,'김길동','kim','kim')";
			String sql3 = "insert into user_info(ui_num,ui_name,ui_id,ui_pwd)";
			sql3 += "values(3,'오길동','oh','oh')";
			int v = m.executeUpdate(sql);
			v = m.executeUpdate(sql2);
			v = m.executeUpdate(sql3);
			System.out.println(v + "개 insert되었음");
			

			

				
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
}