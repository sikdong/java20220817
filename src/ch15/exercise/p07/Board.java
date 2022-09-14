package ch15.exercise.p07;

public class Board {
	private String title;
	private String content;
	
	public Board(String title, String content) {
		this.content = content;
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getContent() {
		return content;
	}
}
