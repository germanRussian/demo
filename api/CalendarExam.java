package api;

import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.Calendar;

public class CalendarExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd // HH:mm:ss");
		Calendar rightNow = Calendar.getInstance();
//		rightNow.set(2021, 11, 12);//출력할때 한달씩 증가하여 출력, 0-11까지만 데이터를 가지기때문
//		
		Calendar rightNow2 = Calendar.getInstance();
		rightNow.add(Calendar.SECOND, 60);
		System.out.println(format.format(rightNow.getTime()));//현재 날짜
		
		rightNow2.roll(Calendar.SECOND, 60);//
		System.out.println(format.format(rightNow2.getTime()));//현재 날짜
		
		
		
		
//		System.out.println(rightNow.get(Calendar.MONTH)+1+"월");
		
//		boolean tf1 = rightNow.before(rightNow2);//현재날짜1가 현재날짜2에 비해 전이냐 묻는것
//		boolean tf2 = rightNow.after(rightNow2);//현재날짜1가 현재날짜2에 비해 후냐 묻는것
//		System.out.println(tf1);
//		System.out.println(tf2);
//		System.out.println(format.format(rightNow.getTime()));//현재 날짜
//		System.out.println(format.format(rightNow2.getTime()));//현재 날짜
//		
		
		
		
		
		
//		rightNow.add(Calendar.MONTH, 11);//달 변경
//		rightNow.add(Calendar.DAY_OF_MONTH, 10);//일 변경
//		rightNow.add(Calendar.SECOND, -120);//2분 감소
//		rightNow.add(Calendar.SECOND, 120);//2분 증가add
//		System.out.println(rightNow.getTime());
		
		
	}

}
