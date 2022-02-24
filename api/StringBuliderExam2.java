package api;

public class StringBuliderExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		StringBulider sql = new StringBulider().append(" Select ").append(" * ").append(" from member ");
		StringBulider sql = new StringBulider();
//		sql.append(" select ");
//		sql.append(" * ");
//		sql.append(" from member ");
//		System.out.println(sql);
		
		String sqlStr = sql.toString();
		System.out.println(sqlStr);
		

	}

}
