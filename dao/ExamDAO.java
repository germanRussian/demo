package dao;

import java.sql.*;

/**
 * 데이터 관리
 * CRUD는 한 개의 메인에 들어가야한다.
 * 
 * 아래의 코드는 그것을 작업해 보도록 하겠다.
 */

import java.util.List;

import domain.ExamVO;

public class ExamDAO {

	/**
	 * C:creat() - 등록하는 메소드 
	 * 접근지정자 : publics 
	 * param : 등록될 값 
	 * return :없음
	 * 
	 * @author smart17
	 *
	 */
	public void create(ExamVO vo) {
		// 코드 작성

		String url = "jdbc:mysql://localhost:3306/smart?characterEncoding=UTF-8&serverTimezone=Asia/Seoul";
		String user = "root";
		String passward = "smart";
		
		
		StringBuffer sql = new StringBuffer();
		sql.append("\n INSERT INTO exam");
		sql.append("\n (varcharTest, charTest, doubleTest, dateTest, dateTimeTest)");
		sql.append("\n VALUES(?, ?, ?, ?, ?)");
		
		
		Connection conn = null;
		PreparedStatement stmt = null;
		int idx = 1; //0으로 시작할때는 ++inx 사용
		
		try {
			// 드라이버로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// DB연결
			conn = DriverManager.getConnection(url, user, passward);
			
			
			// PrepareStatament(SQL작성 및 실행)
			stmt =  conn.prepareStatement(sql.toString());
			
			//?값 설정
			stmt.setString(idx++, vo.getVarcharTest());
			stmt.setString(idx++, vo.getCharTest());
			stmt.setDouble(idx++, vo.getDoubleTest());
			stmt.setDate(idx++, new Date(vo.getDateTest().getTime()));
			stmt.setTimestamp(idx++, vo.getDateTimeTest());
			
			int res = stmt.executeUpdate();// 데이터 삽입
			
				
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
		
		
		finally {
			try {
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
		}
		

	}

	/**
	 * R:read() - 등록하는 메소드 
	 * 접근지정자 : publics 
	 * param : 조회할 값 
	 * return :List
	 *  
	 * @author smart17
	 *
	 */
	public List read() {
		// 코드 작성
		
		String url = "jdbc:mysql://localhost:3306/smart?characterEncoding=UTF-8&serverTimezone=Asia/Seoul";
		String user = "root";
		String passward = "smart";
		StringBuffer sql = new StringBuffer();
		sql.append(" SELECT * FROM exam ");
		
		
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// 드라이버로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			// DB연결
			conn = DriverManager.getConnection(url, user, passward);
			
			
			// PreparStatament(SQL작성 및 실행)
			stmt =  conn.prepareStatement(sql.toString());
			
			rs = stmt.executeQuery(); //실행
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			try {
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
				if(rs != null) rs.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return null;
	}

	/**
	 * U:Update() - 수정하는 메소드 
	 * 접근지정자 : publics 
	 * param : 수정될 값 
	 * return :없음
	 * 
	 * @author smart17
	 * @return 
	 *
	 */
	public void update() {
		
		String paramVarchar = "   ";
		
		String url = "jdbc:mysql://localhost:3306/smart?characterEncoding=UTF-8&serverTimezone=Asia/Seoul";
		String user = "root";
		String passward = "smart";
		
		
		StringBuffer sql = new StringBuffer();
		sql.append(" UPDATE exam SET varcharTest = ? WHERE 1 ");
	
	
		Connection conn = null;
		PreparedStatement stmt = null;
	
	
	try {
		// 드라이버로드
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		// DB연결
		conn = DriverManager.getConnection(url, user, passward);
		
		
		// PreparStatament(SQL작성 및 실행)
		stmt =  conn.prepareStatement(sql.toString());
		
		stmt.setString(1, paramVarchar);
		
		int res = stmt.executeUpdate();
		if(res>0) {
			System.out.println(res + "개의 행이 수정 되었습니다.");
		}else {
			System.out.println("수정 실패했습니다.");
		}
		
		
		
		
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	finally {
		try {
			if(stmt != null) stmt.close();
			if(conn != null) conn.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}

	/**
	 * D:Delete() - 삭제하는 메소드 
	 * 접근지정자 : publics 
	 * param : 삭제될 키값 
	 * return :없음
	 * 
	 * @author smart17
	 *
	 */
	public void delete() {
		
		
		
		

		String url = "jdbc:mysql://localhost:3306/smart?characterEncoding=UTF-8&serverTimezone=Asia/Seoul";
		String user = "root";
		String password = "smart";
		
		StringBuffer sql = new StringBuffer();
		sql.append("\n DELETE FROM exam ");
		
		
		Connection conn = null;
		PreparedStatement stmt = null;
		//ResultSet rs = null;


		try {
			// 1. 드라이버 로드(Class.forName()) - 어떤 데이터베이스 사용할꺼냐
			Class.forName("com.mysql.cj.jdbc.Driver");

//			2. DB연결(DriverManager.getConnection())
			conn = DriverManager.getConnection(url, user, password);

//			3. SQL문작성(Statement, PrepareStatement) - sql직접 실행하거나, 값 설정하고 실행하거나 / PrepareStatement을 주로 사용, Statement는 해킹의 우려가 있다.
			stmt = conn.prepareStatement(sql.toString());
			
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
//				if (rs != null)
//					rs.close();
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
