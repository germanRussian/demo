package api;

public class StringBufferExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sql = new StringBuffer().append(" Select ").append(" * ").append(" from member ");
//		StringBuffer sql = new StringBuffer();
//		sql.append(" select ");
//		sql.append(" * ");
//		sql.append(" from member ");
//		System.out.println(sql);
		
		String sqlStr = sql.toString();
		System.out.println(sqlStr);
		

	}

}
