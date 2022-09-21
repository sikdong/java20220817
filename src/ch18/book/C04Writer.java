package ch18.book;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class C04Writer {
	public static void main(String[] args) throws Exception {
		//문자들로 작성된 파일 복사
		
		File src = new File("src/ch18/book/C04Writer");
		File dec = new File("C:\\Users\\user\\Desktop\\output\\ouput8.txt");
		
		FileReader fr = new FileReader(src);
		FileWriter fw = new FileWriter(dec);
		
		char[] buf = new char[100];
		int len = 0;
		while((len = fr.read(buf)) != -1) {
			fw.write(buf, 0, len);
		}
		fr.close();
		fw.close();
	}
}
