package thread;

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

//	public void setMemory(int memory) -비동기화
//	public synchronized void setMemory(int memory) - 동기화 / 아래는 동기화 블럭
	public void setMemory(int memory) {
		synchronized (this) {
			this.memory = memory;
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + ":" + this.memory);
		}

	}

}
