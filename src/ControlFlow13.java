import java.util.Scanner;

public class ControlFlow13 {
//연차프로그램(년차별) 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// while문

		Scanner i = new Scanner(System.in); // 사용자로부터 입력을 받기 위해 만드는 scan 객체 생성
		System.out.println("년차를 입력하세요.");
		System.out.println("---------------------------------------------");
		
		
		
		

		int longevity = i.nextInt();
		System.out.println(longevity + "연차");

		System.out.println("---------------------------------------------");
		
		
		
		
		

		while (longevity < 1) {
			System.out.println("Usage:양수값을 입력하세요");
			longevity = i.nextInt();
		}

		System.out.println();
		System.out.println("---------------------------------------------");
		
		
		
		
		
		

		switch (longevity) {
		case 1:
			System.out.println("11일 휴가 부여");
			break;
		case 2:
			System.out.println("15일 휴가 부여");
			break;
		case 3:
		case 4:
			System.out.println("16일 휴가 부여");
			break;
		case 5:
		case 6:
			System.out.println("17일 휴가 부여");
			break;
		case 7:
		case 8:
			System.out.println("18일 휴가 부여");
			break;
		case 9:
		case 10:
			System.out.println("19일 휴가 부여");
			break;
		case 11:
		case 12:
			System.out.println("20일 휴가 부여");
			break;
		case 13:
		case 14:
			System.out.println("21일 휴가 부여");
			break;
		case 15:
		case 16:
			System.out.println("22일 휴가 부여");
			break;
		case 17:
		case 18:
			System.out.println("23일 휴가 부여");
			break;
		case 19:
		case 20:
			System.out.println("24일 휴가 부여");
			break;

		default:
			System.out.println("연차 휴가 25일 부여");
			break;
		}

	}

}
