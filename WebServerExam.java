
public class WebServerExam {

	public static void main(String[] args) {
		//has a 방식 -> 가지고 있다 
		WebServer ws = new WebServer();
		ws.port = 80;
		System.out.printf("현재 웹서버포트는 %d 입니다. %n", ws.port);
		//ws.start();
		//ws.stop();
		ws.reStart();
	}

}
