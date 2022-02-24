package demo;

import java.util.*;

public class Exam2 {
	
	private void onTo100() {
		//여기에 코딩하세요. Start
		int a = 0;
		int c = 0;
		int d = 0;
		for (int b = 1; b <= 100; b++) {
			a = a + b;
			if (b % 2 == 0) {
				c = b + c;
			} else if (b % 2 != 0) {
				d = b + d;

			}

		}
		
		System.out.print("홀수합: " + d);
		System.out.print(", 짝수합: " + c);
		System.out.print(", 총합: " + a);
		
		//End		
	}

	public static void main(String[] args) {
		new Exam2().onTo100();
	}


	
	
	
	
	
}
