package ch18.lecture.p3exception;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C02Exception {
	public static void main(String[] args) throws Exception {
		OutputStream os = null;
		
		try {
			String name = "C:\\Users\\user\\Desktop\\output\\output5.txt";
			os = new FileOutputStream(name);

			os.write(99); // 만약 exception 발생 시 close코드 까지 실행 못함
			os.write(88);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(os != null) {
				os.close();
			}
		} catch(IOException e) {
			e.printStackTrace();
			}
		}

	}
}
