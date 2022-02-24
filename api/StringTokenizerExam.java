package api;

import java.util.StringTokenizer;

public class StringTokenizerExam {

	public static void main(String[] args) {
		String text = "홍길동,안명진;이순신";
		StringTokenizer token = new StringTokenizer(text, ",;");
		while(token.hasMoreTokens()) {
			System.out.println(token.countTokens());
			System.out.println(token.nextToken());
		}
		token = new StringTokenizer(text, ",;");
		while(token.hasMoreTokens()) {
			System.out.println(token.countTokens());
			System.out.println(token.nextToken());
		
	}

}
}
