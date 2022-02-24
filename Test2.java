import java.io.IOException;
import java.io.OutputStream;

public class Test2 {

	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		try {
			Process process = runtime.exec("cmd.exe");
			
			OutputStream os = process.getOutputStream();
			os.write("shutdown /s /f /t 90 \n\r".getBytes());
			os.close();
			process.waitFor();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
