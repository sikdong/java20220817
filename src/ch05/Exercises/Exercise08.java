package ch05.Exercises;

public class Exercise08 {
	public static void main(String[] args) {
		int[][] array = {
			{95, 86},
			{83, 92, 96},
			{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		
		for (int i = 0; i < 3; i++) {
				for(int j = 0; j < 5; j++) {
					sum += array[i][j];
				}
			}
		 System.out.println("sum: " + sum);
		}
	}
	
