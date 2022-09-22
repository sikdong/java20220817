package ch18.lecture.p6filter;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class C08PrintStream {
	public static void main(String[] args) {
		String name = "C:\\Users\\user\\Desktop\\output\\output14.txt";
			try {
				FileOutputStream fos = new FileOutputStream(name);
				PrintStream ps = new PrintStream(fos);
				
				ps.write(97);
				ps.print("\n"+97);
				ps.println(3.14);
				
			} catch (Exception e) {
				e.printStackTrace();
			}	
	}
}
