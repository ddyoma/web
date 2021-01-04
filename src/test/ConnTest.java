package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//jdbd 자바데이터베이스커넥터, 자바표준화.
public class ConnTest {
public static void main(String[]args) {
	try {
		Class.forName("oracle.jdbc.OracleDriver");
	} catch (ClassNotFoundException e) {
	
		e.printStackTrace();
	}
	try {
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521/xe","jtest","ezen1234");
		con.setAutoCommit(false);
		//con.setAutoCommit(false); 하면 자동저장안됨.
		Statement stmt = con.createStatement();
	String sql = "insert into song_info(si_num, si_name, si_genre, si_singer, si_creadat)";
	sql += "values(2, '애국가','KPOP','우리모두','19401201')";
	int result = stmt.executeUpdate(sql);
	System.out.println(result + "개 insert되었음");
	con.commit();
	//수동저장
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
}
}
