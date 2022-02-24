/**
 * 성적처리프로그램 만들기.
 * 함수
 * 구조체를 사용할때는 도트를 사용한다.
 * 
 * @author smart9
 *
 */

class Person{
	String name;
	int age;
	String address;
	}

public class StructureExam7 {
	//public 클래스는 main을 품고 있는 클래스, '공개되어 있는 클래스다'라는 말이다. 
	//public 클래스는 1개만 존재. 다른 것은 노멀 클래스.

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name ="홍길동";
		p1.age = 30;
		p1.address = "서울시 용산구 한남동";
		
		System.out.printf("Name: %s%n", p1.name);		//%s는 문자열 ,%n은 줄바꿈
		System.out.printf("Age: %d%n", p1.age);			//%d는 10진수
		System.out.printf("Address: %s%n", p1.address); 
	
	}

}
