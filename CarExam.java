
public class CarExam {

	public static void main(String[] args) {
		
		//Car클래스 객체 Car를 생성하시오.
		Car car = new Car();
		
		
		//set을 이용하여 값을 생성하시오.
		car.setCarmodelName("그랜져");//값을 주고
		car.setSpeed(-100);
		
		
		//get을 이용하여 값을 생성하시오.
		System.out.println("차량 종류는 "+ car.getCarmodelName());//값을 받고
		System.out.println("차량 속도는 "+ car.getSpeed());
		
	}

}
