package ch18.lecture.p7network;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class C05Server {
	public static void main(String[] args) {
		try (
				ServerSocket serverSocket = new ServerSocket(55000);

				Socket socket = serverSocket.accept();

				InputStream is = socket.getInputStream();
				BufferedInputStream bis = new BufferedInputStream(is);) {
			String remoteAddress = socket
					.getRemoteSocketAddress()
					.toString();

			String clientIpAdress = remoteAddress.substring(0, remoteAddress.indexOf(':'));
			String fileName = "";
			
			FileOutputStream fos = new FileOutputStream(fileName);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			
			byte[] buf = new byte[1000];
			int len = 0;
			int fileSize = 0;
			bis.read(buf);
			while ((len = bis.read(buf)) != -1) {
				fileSize += len;
				
			}
			System.out.println(fileSize + "byte 크기의 파일을 받았습니다");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
