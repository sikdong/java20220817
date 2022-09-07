package ch10.book.exercise.p05;

public class P05 {
	public void method1() throws NumberFormatException, ClassNotFoundException{
		
	}
	
	public void method2() {
		try {
			method1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
