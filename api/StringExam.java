package api;

import java.io.UnsupportedEncodingException;

public class StringExam {

	public static void main(String[] args) {
		//format : 서식문자열을 이용해서 서식화된 문자열을 반환한다.
		int i =123456789;
		System.out.println(String.format("%,d", i));
		
		
		
		
		
		//split
		String splitStr = "boo:and:doo";
		String[] strArr = splitStr.split("o");
		System.out.println(strArr.length);
		System.out.println(strArr[0]);
		System.out.println(strArr[1]);
		
		
		
		
		
		
		//Startswith : 문자열이 지정한 문자로 시작하는지 판단 같으면 참, 아니면 거짓
		String msg = "apple";
		System.out.println(msg.startsWith("p"));
		
		
		
		
		
		
		// getByte()
		String str = "안녕하세요";
		byte[] bytes1 = str.getBytes();
		System.out.println(bytes1.length);

		try {
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println(bytes2.length);
			String str2 = new String(bytes2);
			System.out.println(str2);

			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println(bytes3.length);
			String str3 = new String(bytes3);
			System.out.println(str3);

		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		byte[] bytes = "문자열".getBytes();
//		byte[] bytes = "문자열".getBytes("utf-8");
//		System.out.println(new String(bytes));

		// charAt(); 인덱스에 해당하는 문자[char]를 리턴한다.
//		String subject = "999999-1000000";
//		char charVal = subject.charAt(7);
//		if((charVal - '0')%2==0) {
//			System.out.println("여자");
//		}else {
//			System.out.println("남자");
//		};
//		System.out.println(intVal);

	}

}
