package demo;

import java.util.*;

public class Exam4 {
	
	public void method(int [] iArr) {
		//여기에 코딩하세요. Start
		
		Arrays.sort(iArr);
		for (int i = 0; i < iArr.length; i++) {
			System.out.print(iArr[i]);
		}
		//End		
	}
	public static void main(String[] args) {
		//5칸의 정수 배열생성
		int [] iArr = new int[5];
		//임의의값을 배열에 저장
		for (int i = 0; i < iArr.length; i++) {
			iArr[i] = new Random().nextInt(10);
		}
		//method 호출
		new Exam4().method(iArr);
	}


	
	
	
	
	
}
