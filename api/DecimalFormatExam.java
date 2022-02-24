package api;

import java.text.DecimalFormat;

public class DecimalFormatExam {

	public static void main(String[] args) {
//		double num = 1234567.89;
//		
//		DecimalFormat df = new DecimalFormat("#,###.0");
//		
//		String str = df.format(num);
//		
//		System.out.println(str);
		
		DecimalFormat df = new DecimalFormat("000");
		for(int i = 1; i<=100; i++) {
			System.out.println(df.format(i));
		}
	}

}
