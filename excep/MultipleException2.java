package excep;

public class MultipleException2 {

	public static void main(String[] args) {

		try {
			Class.forName(" ");

			Thread.sleep(100);

		} catch (ClassNotFoundException e) {

			System.out.println("ClassNotFoundException");

		} catch (InterruptedException e) {

			System.out.println("ClassNotFoundException");
		}

	}

}
