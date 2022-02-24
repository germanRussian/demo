package api;

import java.util.Calendar;
import java.util.TimeZone;

public class PrintTimeZoneID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Locale
		// Asia/Seoul
		TimeZone timeZone = TimeZone.getTimeZone("America/Chicago");
		Calendar now = Calendar.getInstance();
		System.out.println(now.get(Calendar.HOUR));
		
		
//		String[] ids = TimeZone.getAvailableIDs();
//		for (String id : ids) {
			// System.out.println(id);
//		}
	}

}
