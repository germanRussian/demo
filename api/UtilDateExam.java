package api;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UtilDateExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date now = new Date();//util에 있는 데이트를 사용
		String strNow1 = now.toString();
		now.setMonth(5);
		System.out.println(now.getMonth()+1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 / HH시 (hh시) / mm분 ss초");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
	}

}
