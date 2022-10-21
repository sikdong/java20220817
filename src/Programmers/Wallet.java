package Programmers;

public class Wallet {
	public static void main(String[] args) {
		int[][] sizes = { { 60, 50 }, { 30, 70 }, { 60, 30 }, { 40, 40 } };
		int max = 0;
		int temp = 0;
		// 제일 큰 숫자 찾고
		for (int i = 0; i < sizes.length; i++) {
			for (int j = 0; j < sizes[i].length; j++) {
				max = Math.max(max, sizes[i][j]);
				temp = j;
				System.out.println(temp);
			}
		}
		System.out.println(max);
		System.out.println(temp);
		int h = 0;
		// 가로면 각 배열의 큰 숫자들이 가로로 올 수 있도록 한 다음 가장 큰 숫자 리턴
		for (int i = 0; i < sizes.length; i++) {
			if (temp == 1) {
				if(sizes[i][0] < sizes[i][1]) {
					
				int tempArr = sizes[i][0];
				sizes[i][0] = sizes[i][1];
				sizes[i][1] = tempArr;
				}

				h = Math.max(h, sizes[i][1]);
			}
		}
		System.out.println(h);
			// 세로면 각 배열의 큰 숫자들이 세로로 올 수 있도록 한 다음 가장 큰 숫자 리턴
//			if (temp == 0 && sizes[i][0] > sizes[i][1]) {
//				int tempArr = sizes[i][1];
//				sizes[i][1] = sizes[i][0];
//				sizes[i][0] = tempArr;
//				
//				h = Math.max(h, tempArr);
//			}
//
//		}

	}
}
