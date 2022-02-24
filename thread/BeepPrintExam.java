package thread;

import java.awt.Toolkit;

public class BeepPrintExam {
/**
 * 단일스레드 : 소리가 먼저 나고 이후에 콘솔에 표시함. 동시에 작업이 안된다.
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i =0; i<5; i++) {
			toolkit.beep();//소리남
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		for(int i =0; i<5; i++) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("팅");
		}
	}

}
