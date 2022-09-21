package ch18.lecture.p01InputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class C01InputStream {
	public static void main(String[] args) throws Exception {
		//InputStream : 프로그램 기준으로 입력 받는 객체를 만드는 클래스
		//입력 단위 : byte
		
		String path = "src/ch18/lecture/p01InputStream/C01InputStream.java";
		InputStream is = new FileInputStream(path);
		
		//read() : 한 바이트 읽기
		int r1 = is.read();
		int r2 = is.read();
		int r3 = is.read();
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		
		is.close(); // 자원 사용 후 닫기 필수적임(스트림을 클래스에 연결해 놓으면 다른 곳에서 사용할 수 없기 때문)
		
		
		
		
		
	}
	
}

