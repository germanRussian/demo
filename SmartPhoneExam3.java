
public class SmartPhoneExam3 {

	public static void main(String[] args) {
		// 객체선언
		SmartPhone sp = new SmartPhone(null,null,null,null,"11111111111111111111");
		SmartPhone sp1 = new SmartPhone();
		
		
		
		// 객체초기값
		// 속성 : 객체명. 속성
		sp.caseColor = "spacegrey";
//		sp.PhoneNumber = "123456789";
		sp1.caseColor = "grey";
//		sp1.PhoneNumber = "987654321";
		

		// 객체값출력
		System.out.println("휴대폰색상 : " + sp.caseColor);
		System.out.println("휴대폰 번호 : " + sp.PhoneNumber);
		System.out.println();
		System.out.println("휴대폰색상 : " + sp1.caseColor);
		System.out.println("휴대폰 번호 : " + sp1.PhoneNumber);
		System.out.println();

//		// 객체메소드호출
//		sp.TakingPictures();
//		sp.makeACall("123456789");
//		System.out.println();
//		sp1.TakingPictures();
//		sp1.makeACall("951753852456");


		// 가비지콜렉션호출
		sp = sp1 = null;
		System.gc();

	}

}
