package excep;

public class NumberFormatException {

	public static void main(String[] args) {
		try {
			String data1 = "100";
			String data2 = "aaaa";
			int value1 = Integer.parseInt(data2);
			System.out.println(value1);
		}catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}finally {
			System.out.println("예외가 발생하더라도 무조건 실행됩니다.");
		}

	}

}
