/**
 * 스마트폰 클래스
 * @author smart17
 *
 */
public class SmartPhone {

	//멤버변수
	String caseColor; //폰케이스 색상
	String cameraPixel; //카메라 화소
	String lcdSize; //화면 크기
	String modelName; //폰 기종
	String phoneNumber; //전화번호 
	
	
	//멤버메소드
	//디폴트생성자
	public SmartPhone() {
		System.out.println("디폴트생성자를 호출했어요.");
	}
	//디폴트가 없으면 에러가 난다. 객체 인스턴스가 안된다. 
	
	public SmartPhone(String caseColor, String cameraPixel, String lcdSize, 
			String modelName, String phoneNumber) {
		this.caseColor = caseColor;
		this.cameraPixel = cameraPixel;
		this.lcdSize = lcdSize;
		this.modelName = modelName;
		this.phoneNumber = phoneNumber;
	}


	/**
	 * 사진을 찍다
	 */
	void takingPictures() {
		System.out.println("사진을 찍다.");
	}
	/**
	 * 전화걸기
	 * @param toPhoneNumber
	 */
	void makeACall(String toPhoneNumber) {
		System.out.println(toPhoneNumber+"번호로 전화를 겁니다.");
	}
	/**
	 * 앱 실행
	 */
	void playApp(String appName) {
		System.out.println(appName+"앱을 실행합니다.");
	}
}
