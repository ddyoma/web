package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnTest2 {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			// 단위테스트
			//TDD 개발방법론 테스트 드라이븐 디벨롭먼 
			e.printStackTrace();
		}
		Connection con;
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "jtest", "ezen1234");
			Statement stmt = con.createStatement();
			
			String sql = "update song_info";
			sql += " set si_name='동전한닢',";
			sql += " si_singer='다듀',";
			sql += " si_genre='힙합',";
			sql += " si_creadat='20070531'";
			
			int result = stmt.executeUpdate(sql);
			System.out.println(result+"개 업뎃함");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
