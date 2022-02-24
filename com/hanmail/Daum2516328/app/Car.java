package com.hanmail.Daum2516328.app;



public class Car {
	
	static Tire t1;
	static Tire t2 ;
	
	public Car() {
		
		t1 = new HankookTire();
		t2 = new kumhoTire();
		
	}
	
	
	public static void main(String[] args) {
		Car car = new Car();
		car.t1.setInch(15);
		System.out.println(car.t1.getInch());
		
		
		Car car2 = new Car();
		car2.t1.setInch(20);
		System.out.println(Car.t1.getInch());
		//com.hankook.Tire tire = new com.hankook.Tire(); -  임포트문을 사용하지 않은 것.
		//패키지명.클래스명.변수명
		
		//Tire tire = new Tire();//컨트롤 스페이스 - 자동 임포트문 작성, 위의 작성문과 같음, 이는 임포트문을 사용한것.
	}
}
