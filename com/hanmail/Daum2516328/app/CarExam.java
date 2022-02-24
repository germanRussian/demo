package com.hanmail.Daum2516328.app;

/**
 * 
 * 하나의 배열로 객체 관리
 * 
 * @author smart17
 *
 */
public class CarExam {

	public static void main(String[] args) {

		CarExam [] re1 = new CarExam [2];
		re1[0] = new CarExam();
		re1[1] = new CarExam();
		
		System.out.println(re1);
		System.out.println(re1[0]);
		System.out.println(re1[1]);
		
		System.out.println("---------------------------------");
		
		int [] i = new int [2];
		i[0] = 10;
		i[1] = 20;
		System.out.println(i);
		System.out.println(i[0]);
		System.out.println(i[1]);
		
		System.out.println("----------------------------------");
		
		
	}

}
