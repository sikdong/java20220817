package ch18.lecture.p01InputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04InputStream {
	public static void main(String[] args) throws Exception {
		String path = "src/ch18/lecture/p1inputStream/C04InputStream.java";
		FileInputStream fis = new FileInputStream(path);
		
		byte[] buffer = new byte[10];
		
		int cnt = 0;
		
		while((fis.read(buffer) != -1)){
			cnt++;
			}
		
		fis.close();
		
		}
	}
