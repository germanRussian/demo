package thread;

public class CalcThread extends Thread{

	
	
	
	
	public CalcThread(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		for(int i =0; i<Integer.MAX_VALUE; i++) {
			
		}
		
		System.out.println(getName());
	}
	

}
