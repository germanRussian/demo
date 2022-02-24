package api;

import common.JavaUtil;

public class MathExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String str = "123456789";
//		System.out.println(JavaUtil.nillToBlank(str).length());
//		System.out.println((str ==null)? "".length() :str.length());
//		System.out.println(JavaUtil.round(Math.random(), 3));//3자리만 보여달라
//		
//		System.out.println(Math.round(Math.random()*1000)/1000.);
		
		int num = (int)(Math.random()*11) +10; //10~20까지 랜덤 숫자 뽑아내기.
		System.out.println(num);
	}

}
