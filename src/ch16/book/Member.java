package ch16.book;

public class Member {
	private String name;
	private String id;
	
	public Member() {
		System.out.println("Member() 실행");
	}

	public Member(String name, String id) {
		super();
		System.out.println("Member(String name, String id)");
		this.name = name;
		this.id = id;
	}

	public Member(String id) {
		super();
		System.out.println("Member(String id) 실행");
		this.id = id;
		
	}

	public String getId() {
		return id;
	}
	
}
