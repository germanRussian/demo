
public class WebServerExam {

	public static void main(String[] args) {
		//(has a)방식, 별도의 만들어진 클래스를 호출해서 쓰는 방식을 의미.
		WebServer ws = new WebServer();
		ws.port = 80;
		System.out.printf("현재 웹서버 포트는 %d 입니다.%n", ws.port);
		
		//ws.start();
		//ws.stop();
		ws.reStart();

	}

}
