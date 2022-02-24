package api;

import java.sql.Date;
import java.util.Random;

public class RandomExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random(System.currentTimeMillis());
		
		System.out.println(random.nextInt(11)+10);
		//System.out.println(Math.abs(random.nextInt(11)));
		
		
	}

}
