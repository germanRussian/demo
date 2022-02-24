package thread;

public class proirityExam {

	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			Thread thread = new CalcThread("thread" + "-" + i);
			if (i != 10) {
				thread.setPriority(thread.MIN_PRIORITY);
			} else {
				thread.setPriority(thread.MAX_PRIORITY);
			}
			thread.start();
		}
	}

}
