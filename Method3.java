import java.util.Scanner;

/**
 * 
 * @author smart9
 *
 */
public class Method3 {
	public static void aaa(int a) {

		// int a = 36;
		int a2 = a / 12;// 연차
		if (a2 % 12 > 0) {
			a2++; // a = a + 1;
		}
		System.out.println("---------------------------------------------");

		switch (a2) {
		case 1:
			System.out.println("11일 휴가 부여");
			break; // ((a-1)+"일 휴가 부여");
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
			System.out.println("연차 휴가일 부여");
			break;
		}

	}

	public static void main(String[] args) {
		for(int i =0; i<21;i++)
		aaa(i*12);

	}

}
