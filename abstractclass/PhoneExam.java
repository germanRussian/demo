package abstractclass;

public class PhoneExam {

	public static void main(String[] args) {
		//Phone phone = new Phone();
		//필드
		Smartphone smartphone = new Smartphone("바바바바밥동");
		
		//홍길동을 출력해보세요
		System.out.println(smartphone.owner);//객체명.필드
		
		smartphone.turnOn();//객체명.메소드()
		smartphone.internetSearch();
		smartphone.turnOff();
	}

}
