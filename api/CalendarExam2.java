package api;

import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.Calendar;

public class CalendarExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//단위 개월을 출력하시오
		//12월 31일부터 1월 30일까지
		//1월 31일부터 2월 28일까지
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Calendar rightNow = Calendar.getInstance();
		rightNow.set(2021, 2, 31);//출력할때 한달씩 증가하여 출력, 0-11까지만 데이터를 가지기때문
		System.out.println(format.format(rightNow.getTime()));//현재 날짜
		
		rightNow.add(Calendar.MONTH, 1);
		rightNow.add(Calendar.DAY_OF_MONTH, 0);
		System.out.println(format.format(rightNow.getTime()));
		
		
		rightNow.add(Calendar.MONTH, 1);
		rightNow.add(Calendar.DAY_OF_MONTH, -1);
		System.out.println(format.format(rightNow.getTime()));
		
		
		
		
	}

}
