//값을 줄때 set 받을때 get 
public class carExam {

	public static void main(String[] args) {
		//Car 클래스 객체 car를 생성하시오.
		car car = new car();
		//setXX를 이용하여 값을 설정하시오.
		car.setModelName("그랜져");
		car.setSpeed(300);
		//getXXX를 이용하여 값을 출력하시오.
		System.out.println("차량은 " + car.getModelName());
		System.out.println("현재속도는 " + car.getSpeed());
	}

}
