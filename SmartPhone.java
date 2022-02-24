/**
 * 
 * 스마트폰 클래스
 * @author smart9
 *
 */
public class SmartPhone {
	
	//멤버 변수
	String caseColor;   //폰 케이스 색상
	String cameraPixel; //카메라 화소
	String lcdSize;		//화면 크기
	String modelName;	//모델명
	String PhoneNumber; //번호
	
	//멤버 메소드
	public SmartPhone() {//디폴트 생성자
		System.out.println("디폴트 생성자를 호출했어요.");
	}
	
	public SmartPhone(String caseColor, String cameraPixel, String lcdSize, String modelName, String phoneNumber) {
		//super();
		this.caseColor = caseColor;
		this.cameraPixel = cameraPixel;
		this.lcdSize = lcdSize;
		this.modelName = modelName;
		this.PhoneNumber = phoneNumber;
	}

	
	
	
	
	/**
	 * 사진을 찍다.
	 */
	void TakingPictures() {
		System.out.println("사진을 찍다.");
	}
	/**
	 * 전화 걸기
	 * @param toPhoneNumber
	 */
	void makeACall(String toPhoneNumber) {
		System.out.println(toPhoneNumber+"전화 발신");
	}
	/**
	 * 앱 실행
	 */
	void playApp(String appName) {
		System.out.println(appName + " app 실행");
	}
	
	
	
	
	
}
