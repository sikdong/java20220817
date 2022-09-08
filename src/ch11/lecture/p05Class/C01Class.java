package ch11.lecture.p05Class;

public class C01Class {
	public static void main(String[] args) throws Exception {
		Class c;
		
		String s1 = "java";
		
		Class c1 = s1.getClass();
		System.out.println(c1.getName());

		Class c2 = Class.forName("java.lang.String");
		System.out.println(c2.getName());
	}
}
