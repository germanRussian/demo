package api;

import java.sql.Date;

public class SystemExam {

	public static void main(String[] args) {
		//1644552183236 - Timestamp
		long now = System.currentTimeMillis();
		System.out.println(now);
		System.out.println(new Date(now));
	}

}
