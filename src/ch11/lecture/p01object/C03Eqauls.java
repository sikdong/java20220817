package ch11.lecture.p01object;

public class C03Eqauls {
	public static void main(String[] args) {
		Book b1 = new Book();
		Book b2= new Book();
		
		System.out.println(b1.equals(b2)); //false

		
		Object b3 = new Book(333);
		Object b4 = new Book(333);
	}
}

class Book extends Object {
	private int code;
	
	Book(){
		
	}
	
	 Book(int code) {
		 this.code = code;
	}
	 
	 @Override
	public boolean equals(Object obj) {
		 if (obj instanceof Book) {
			 Book o = (Book) obj;
			 if(obj != null) {
				 
				 return this.code == o.code;
			 }
		 }
		 return false;
	 }
	 
	 @Override
	public int hashCode() {
		 return code *31;
	 }
}
