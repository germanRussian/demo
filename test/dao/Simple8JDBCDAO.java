package test.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;


/**
 * 
 * JDBC 프로그래밍 mysql DB와 연동되어 콘솔에 DB를 띄울 수 있다.
 * 
 * 이장에서는 내용을 등록해 보겠다. 
 * 
 * 이번 장에서는 제거하도록 하겠다.
 *  D
 * @author smart17
 *
 */
public class Simple8JDBCDAO {

	public static void main(String[] args) {

		String paramVarchar = "varcharTestUpdate";
		

		String url = "jdbc:mysql://localhost:3306/smart?characterEncoding=UTF-8&serverTimezone=Asia/Seoul";
		String user = "root";
		String password = "smart";
		
		
		String sql = "DELETE FROM exam WHERE varcharTest = ?";


		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;


		try {
			// 1. 드라이버 로드(Class.forName()) - 어떤 데이터베이스 사용할꺼냐
			Class.forName("com.mysql.cj.jdbc.Driver");

//			2. DB연결(DriverManager.getConnection())
			conn = DriverManager.getConnection(url, user, password);

//			3. SQL문작성(Statement, PrepareStatement) - sql직접 실행하거나, 값 설정하고 실행하거나 / PrepareStatement을 주로 사용, Statement는 해킹의 우려가 있다.
			stmt = conn.prepareStatement(sql);
			
			stmt.setString(1, paramVarchar);
			
			
			

//			4. SQL문실행(executeQuery(), executeUpdate())
			int res = stmt.executeUpdate();
			if(res>0) {
				System.out.println(res + "개의 행이 삭제 되었습니다.");
			}else {
				System.out.println("삭제 실패했습니다.");
			}
//			5. Select문 만 ResultSet 객체를 반환한다. 나머지는 int를 반환한다.

			

		} catch (Exception e) {

			// TODO Auto-generated catch block
			e.printStackTrace();

		} finally {

			// 6. 닫기(close())
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
