package ch03.book;

public class ArrayInArrayExample {
	public static void main(String[] args) {
		
		int [][] mathScores = new int[2][3];
		for (int i = 0; i < mathScores.length; i++) {
			for (int k = 0; k < mathScores[i].length; k++) {
				System.out.println("mathScores["+i+"]["+k+"]="+mathScores[i][k]);
			}
		}
		System.out.println();
		
		
		int[][] englishScores = new int[2][];
	}
}
