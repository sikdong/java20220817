package ch18.lecture.p4reader;

import java.io.FileReader;
import java.io.Reader;

public class C04Reader {
	public static void main(String[] args) throws Exception {
		String fileName = "src/ch18/lecture/p4reader/C03Reader.java";
		Reader fr = new FileReader(fileName);
		
		// read(char[]) : char배열에 읽은 문자를 채우고 읽은 문자 갯수를 리턴
		
		char[] buffer = new char[100];
		
		int len1 = fr.read(buffer);
		
		fr.close();
	}
}
