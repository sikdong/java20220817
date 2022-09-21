package ch18.lecture.p4reader;

import java.io.FileReader;
import java.io.Reader;

public class C03Reader {
	public static void main(String[] args) throws Exception {
		String fileName = "src/ch18/lecture/p4reader/C03Reader.java";
		Reader fr = new FileReader(fileName);
		
		
		int cnt = 0;
		while(fr.read() !=-1) {
			cnt++;
		}
		
		System.out.println(cnt);
		
		fr.close();
	}
}
