package excep;

public class MultipleException3 {

	public static void main(String[] args) {
		
		
		try {
			Class.forName(" ");
			
			Thread.sleep(100);
			
		} catch (Exception e) {
			
			System.out.println("ClassNotFoundException");
		}
		

	}

}
