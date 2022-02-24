package api;

import java.text.MessageFormat;

public class MessageFormatExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String id = "blue";
		String name = "신용권";
		String tel = "010-123-5678";

		String msg = "회원 ID : {0} \n회원 이름 : {1} \n회원 전화 : {2}";
		String a = MessageFormat.format(msg, id, name, tel);
		System.out.println(a);

		String sql = "insert into member values {0}{1}{2})";
		Object[] b = { "'java',", "'Anna',", "'010-234-5678'" };
		String c = MessageFormat.format(sql, b);
		System.out.println(c);
	}
}
