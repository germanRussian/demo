
public class ControlFlow8 {
//연차프로그램 test
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// switch문

		int a = 12;
		int b = a / 12;

		if ((a % 12) != 0) {
			b = b + 1;

		}

		System.out.println((b) + ("연차"));
		
						
		switch (b) {
		case 1 : System.out.println("11일 휴가 부여");	break;
		case 2 : System.out.println("15일 휴가 부여");	break;
		case 3 :case 4:	System.out.println("16일 휴가 부여");  break;
		case 5 :case 6:	System.out.println("17일 휴가 부여");	break;
		case 7 :case 8: System.out.println("18일 휴가 부여"); 	break;
		case 9 :case 10:System.out.println("19일 휴가 부여");	break;
		case 11:case 12:System.out.println("20일 휴가 부여");  break;
		default:System.out.println("연차 없음");break;
		}
		
		}

}



