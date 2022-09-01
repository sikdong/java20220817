package ch08.book.exercise.p04;

public class OracleDao implements DataAccessObject {

	String name = "Oracle";
	
	@Override
	public void select() {
		System.out.println(this.name + " DB에서 검색");
	}

	@Override
	public void insert() {
		System.out.println(this.name + " DB에 삽입");
	}

	@Override
	public void update() {
		System.out.println(this.name + " DB를 수정");
	}

	@Override
	public void delete() {
		System.out.println(this.name + " DB에서 삭제");
	}

}
