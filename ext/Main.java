package ext;//상속 개념

public class Main {

	public static void main(String[] args) {
//		Notice notice = null;
//
//		notice = new Notice();

		Notice notice = new Notice();

		// Notice notice = new Notice(); 위와 동일하다.
		notice.setTitle("첫번째 공지글입니다.");
		// 객체명. 필드 또는 객채명.메소드() 방식으로 활용한다.
		System.out.println(notice.getTitle());

		Gallery gallery = new Gallery();
		// gallery.setImgFile("그림.png");

		System.out.println(gallery.getFile());

	}

}
