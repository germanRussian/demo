package com.hanmail.Daum2516328.app;

public class MethodMain {

	public static void main(String[] args) {
		MethodC c= new MethodC();
		//c.methodC();
		
		MethodP p = c;
		p.show();
		//캐스팅
		MethodC c2 = (MethodC)p;
		c2.show();
	}

}
