package thread;

public class StatePrintThread extends Thread {

	private static State TERMINATED;
	private Thread targetThread;

	public StatePrintThread() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StatePrintThread(Thread targetThread) {
		this.targetThread = targetThread;
	}

	@Override
	public void run() {
		while (true) {
			Thread.State state = targetThread.getState();// INNER class 사용 = Thread.State
			System.out.println("타겟 스레드 상태 : " + state);

			if (state == Thread.State.NEW) {
					
					targetThread.start();
					
			}
			if(state ==thread.StatePrintThread.TERMINATED) {
				break;
			}
			try {
				Thread.sleep(10000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}
