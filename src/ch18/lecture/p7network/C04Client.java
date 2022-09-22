package ch18.lecture.p7network;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class C04Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		System.out.println("연결 시도");

		try (Socket socket = new Socket("172.30.1.60", 30000);) {

			System.out.println("연결됨!");

			OutputStream os = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(osw);
			PrintWriter pw = new PrintWriter(bw);

			Scanner scanner = new Scanner(System.in);

			try (os; osw; bw; pw; scanner;) {
//		pw.println("클라이언트 입니다");

				String data = "";

				while (!data.equals("bye")) {
					System.out.print("입력>");
					data = scanner.nextLine();
					pw.println(data);
					pw.flush();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}
}
