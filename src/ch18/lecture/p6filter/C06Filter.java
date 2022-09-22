package ch18.lecture.p6filter;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class C06Filter {
	public static void main(String[] args) throws Exception {
		String name = "C:\\Users\\user\\Desktop\\output\\output12.txt";
		InputStream fs = new FileInputStream(name);
		InputStreamReader isr = new InputStreamReader(fs);
		BufferedReader br = new BufferedReader(isr);
		
		String len = null;
		
		while((len = br.readLine()) != null) {
				System.out.println(len);
		}
		
		br.close();
		isr.close();
		fs.close();
	}
}
