package ch04.Exercise;

public class Exercise04Teacher {
	public static void main(String[] args) {
		
	while(true) {
		
	int d1 = (int) (Math.random() * 6) + 1;
	int d2 = (int) (Math.random() * 6) + 1;
	
	System.out.println("(" + d1 + ", " + d2 + ")");
	
	if (d1 + d2 == 5) {
		break;
	}
	}
	}
	
}
