package demo;

import java.util.*;

public class Exam1 {
	
	private void fibonacci() {
		//여기에 코딩하세요. Start
		int a = 0;
		int b = 1;
		int c = 0;
		
		for (;c<5; ) {
			a=b;
			b=c;
			c=a+b;
			System.out.print(" " + c);
		
		}	
	}

	public static void main(String[] args) {
		new Exam1().fibonacci();
	}


	
	
	
	
	
}
