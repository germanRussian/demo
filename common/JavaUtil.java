package common;


public class JavaUtil {
	/**
	 * round 함수
	 * @param double 실수값
	 * @param int 소수점 자리수
	 * @return double
	 */
	
		public static double round(double d, int i) {
			return Math.round(d*Math.pow(10, i))/Math.pow(10, i);
			
			
		}
		/**
		 * 
		 * @param s
		 * @return
		 */
		public static String nillToBlank(String s) {
			if(s==null) {
				s= "";
			}
			return s;
		}
}
