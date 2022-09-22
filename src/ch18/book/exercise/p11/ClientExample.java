package ch18.book.exercise.p11;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.net.Socket;

public class ClientExample {
	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("localhost", 50000);
		String filePath = "C:\\Users\\user\\Desktop\\output\\풍경.jpg";
		File file = new File(filePath);
		String fileName = file.getName();
		
		OutputStream os = socket.getOutputStream();
		
		
		InputStream is = new FileInputStream(filePath);
		BufferedInputStream bis = new BufferedInputStream(is);
		
		BufferedOutputStream bos = new BufferedOutputStream(os);
		byte[] buf = new byte[100]; 
				fileName.getBytes(0, fileName.length(), buf, 0);
		bos.write(buf);
			
		System.out.println("[파일 보내기 시작]" + fileName);
		
		byte[] buf1 = new byte[1000];
		int len1 = 0;
		while((len1 = bis.read(buf1)) != -1){
			bos.write(buf1, 0, len1);
		}
		
		bos.flush();
		os.close();
		is.close();
		bis.close();
		bos.close();
		socket.close();
		
	}
}
