package ch18.lecture.p2OutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import ch18.book.FileInputStreamExample;

public class C04OutputStream {
	public static void main(String[] args) throws Exception {
		String inFile = "src/ch18/lecture/p2OutputStream/C04OutputStream.java";
		String outFile = "C:\\Users\\user\\Desktop\\output\\output4.txt";
		
		FileInputStream fis = new FileInputStream(inFile);
		FileOutputStream fos = new FileOutputStream(outFile);
		
		byte[] b = new byte[10];
		
		int len = 0;
		
		while((len = fis.read(b)) != -1){
			fos.write(b, 0, len);
		} 
		fis.close();
		fos.close();
		
	}
}
