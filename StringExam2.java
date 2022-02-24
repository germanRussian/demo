/**
 * 문자열 String 클래스
 * 
 * @author smart9
 *
 */
public class StringExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "abc";
		String s2 = "abc";
		
		
		System.out.println(s==s2);
		System.out.println(s.equals(s2));
		System.out.println(s);
		System.out.println(s2);
		
		// 교재 145p 참조.
		
		
		
		StringBuffer sb = null;
		sb = new StringBuffer("AB");
		sb.append("123");  //sb메모리에 덧붙인다.
		
		
		
	}

}
