import java.sql.Date;

public class test {

	public static void main(String[] args) {
		Date date
		= new Date(System.currentTimeMillis());
		
		System.out.println(date);
		
		java.util.Date date2
		= new java.util.Date(System.currentTimeMillis());
		
		System.out.println(date2);
	}

}
