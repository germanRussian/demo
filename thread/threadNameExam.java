package thread;

public class threadNameExam {

	public static void main(String[] args) {
		
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.MIN_PRIORITY);
		System.out.println(Thread.NORM_PRIORITY);
		
		Thread mainThread = Thread.currentThread();
		mainThread.setPriority(5);
		System.out.println("프로그램 시작 스레드 이름:" + mainThread.getName());
		
		Thread a = new threadA();
		System.out.println("작업 스레드 이름:" + a.getName());
		a.start();
		
//		Thread mainThread = Thread.currentThread();
//		System.out.println("프로그램 시작 스레드 이름:" + mainThread.getName());
//		
//		
	}

}
