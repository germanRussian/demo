package com.hanmail.Daum2516328.app;

public class MethodC extends MethodP {
 public MethodC() {
	 //new MethodP().methodP(); -  메소드 호출 방식
	 super();
	
	 //super는 부모를 가르키고, 여기에서는 부모에 있는 메소드를 활용하겟다.라는 의미
	 this.methodC2(); // 동치 c.methodP2();
	 //this는 내 자신을 불러온다.
	 System.out.println("methodC()");
 }
 public void methodC2() {
	 System.out.println("wow");
 }
 
 @Override//오버라이드를 통해서 재정의됨.
 public void show() {
		System.out.println("자식메소드");
	}
}
