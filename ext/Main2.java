package ext;//상속 개념

public class Main2 {

	public static void main(String[] args) {
		Board notice = null;

		notice = new Board();

		// Board notice = new Board(); 위와 동일하다.
		notice.setTitle("첫번째 공지글입니다.");
		//객체명. 필드 또는 객채명.메소드() 방식으로 활용한다.
		System.out.println(notice.getTitle());

	
		Board gallery = null;

		gallery = new Board();

		// Board notice = new Board(); 위와 동일하다.
		gallery.setTitle("첫번째 갤러리글입니다.");
		//객체명. 필드 또는 객채명.메소드() 방식으로 활용한다.
		System.out.println(gallery.getTitle());
		System.out.println(gallery.getFile());

	}

}
