package test.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 
 * JDBC 프로그래밍 mysql DB와 연동되어 콘솔에 DB를 띄울 수 있다. 이장에서는 전체 내용을 가져와 보겠다.
 * Statement를 활용
 * R
 * @author smart17
 *
 */
public class Simple4JDBCDAO {

	public static void main(String[] args) {
		
		
		
		double param = 100;
		String url = "jdbc:mysql://localhost:3306/smart?characterEncoding=UTF-8&serverTimezone=Asia/Seoul";
		String user = "root";
		String password = "smart";
		String sql = "SELECT * FROM exam WHERE intTest =" + param;

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			// 1. 드라이버 로드(Class.forName()) - 어떤 데이터베이스 사용할꺼냐
			Class.forName("com.mysql.cj.jdbc.Driver");

//			2. DB연결(DriverManager.getConnection())
			conn = DriverManager.getConnection(url, user, password);

//			3. SQL문작성(Statement, PrepareStatement) - sql직접 실행하거나, 값 설정하고 실행하거나 / PrepareStatement을 주로 사용, Statement는 해킹의 우려가 있다.
			stmt = conn.createStatement();

//			4. SQL문실행(executeQuery(), executeUpdate())
			rs = stmt.executeQuery(sql);

//			5. Select문 만 ResultSet 객체를 반환한다. 나머지는 int를 반환한다.

			while (rs.next()) {
				System.out.printf("varcharTest:%s,", rs.getString("varcharTest"));
				System.out.printf("charTest:%s,", rs.getString("charTest"));
				System.out.printf("intTest:%s,", rs.getString("intTest"));
				System.out.printf("dateTest:%s,", rs.getString("dateTest"));
				System.out.printf("datetimeTest:%s %n", rs.getString("datetimeTest"));

			}
			;

		} catch (Exception e) {

			// TODO Auto-generated catch block
			e.printStackTrace();

		} finally {

			// 6. 닫기(close())
			try {
				if (rs != null) 	rs.close();
				if (stmt != null)	stmt.close();
				if (conn != null)	conn.close();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
