package thread;

import java.awt.Toolkit;

public class BeepPrintExam2 {
/**
 * 멀티스레드 : 소리와 콘솔이 동시에 작업이 된다.
 * @param args
 */
	public static void main(String[] args) {
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		thread.start();
		
		for(int i =0; i<5; i++) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.printf("팅 %n-----%n");
		}
	}

}
