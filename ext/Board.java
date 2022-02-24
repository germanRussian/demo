package ext;

public class Board {
	private String title;//제목
	private String content;//내용
	private String file;
	
	
	public String getFile() {
		return "모든 파일을 처리합니다.";
	}
	public void setFile(String file) {
		this.file = file;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	

}
