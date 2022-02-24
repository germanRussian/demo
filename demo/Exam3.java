package demo;

import java.util.*;

public class Exam3 {
	
	public int method(String string, int i, int j) {
		//여기에 코딩하세요. Start
		int res = i + j;
		return res;
		//End		
	}

		
	public static void main(String[] args) {
		int res = new Exam3().method("+", 2, 3);
		System.out.println("2 + 3 = " + res);
	}
	
	
	
	
}
