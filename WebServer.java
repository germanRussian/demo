
public class WebServer {
	
	//필드
	int port;
	
	//메소드
	/**
	 * 서버시작
	 */
	void start() {
		System.out.println("서버를 시작합니다.");
		
	}
	/**
	 * 서버 종료
	 */
	void stop() {
		System.out.println("서버를 종료합니다.");
	}
	/**
	 * 서버 재시작
	 */
	void reStart() {
		stop();
		start();
	}
}
