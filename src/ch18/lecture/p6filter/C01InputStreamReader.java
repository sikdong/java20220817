package ch18.lecture.p6filter;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class C01InputStreamReader {
	public static void main(String[] args) throws Exception {
		String name = "src/ch18/lecture/p6filter/C01InputStreamReader.java";
		
		FileInputStream fis = getFileInputStream(name);
		Reader rd = new InputStreamReader(fis);
		
		
		
	}
	
	private static FileInputStream getFileInputStream(String fileName) throws Exception {
		
		return new FileInputStream(fileName);
		
	}
}	
