package ch18.lecture.p5writer;

import java.io.FileWriter;
import java.io.Writer;

public class C01writer {
	public static void main(String[] args) throws Exception {
		// Writer : 문자 단위로 출력하는 스트림
		// 주요 : write
		String fileName = "C:\\Users\\user\\Desktop\\output\\output5.txt";

		Writer wr = new FileWriter(fileName);

		// write(int) : 문자 하나 출력하는 메소드
		wr.write('a'); // char 그냥 넣어도 됨 char => int로 자동 형변환
		wr.write('b');
		wr.write('한');
		wr.write(9742);

		wr.close();
	}
}
