package ch18.book;

import java.io.FileReader;

public class FileReaderExample {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader(
				"src/ch18/book/FileReaderExample.java"
				);
				
		int readCharNO;
		char[] cbuf = new char[100];
		
		while((readCharNO = fr.read(cbuf)) != -1) {
			String data = new String(cbuf, 0, readCharNO);
			System.out.println(data);
		}
		fr.close();
	}
}
