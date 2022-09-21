package ch18.lecture.p01InputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class C02inputStream {
	public static void main(String[] args) throws Exception {
		String path = "src/ch18/lecture/p01InputStream/C02inputStream.java";
		InputStream is = new FileInputStream(path);
		int cnt = 0;
		while((is.read()) != -1){
			cnt++;
		}
		System.out.println(cnt + "번 읽음");
		
		is.close();
	}
}
