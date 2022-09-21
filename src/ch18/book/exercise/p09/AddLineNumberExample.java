package ch18.book.exercise.p09;

import java.io.BufferedReader;
import java.io.FileReader;

public class AddLineNumberExample {
	public static void main(String[] args) throws Exception {
		String filePath = "src/ch18/book/exercise/p09/AddLineNumberExample.java";
		
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		String line = null;
		int num = 1;
		
		while((line = br.readLine()) != null) {
			System.out.println(num + ":" +line);
			num++;
		}
	}
}
