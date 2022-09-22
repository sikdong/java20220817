package ch18.lecture.p6filter;

import java.io.*;


public class C07Filter {
	public static void main(String[] args) throws Exception {
		String inputFile = "C:\\Users\\user\\Desktop\\output\\output12.txt";
		String outputFile = "C:\\Users\\user\\Desktop\\output\\output13.txt";
		
		InputStream is = new FileInputStream(inputFile);
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		OutputStream os = new FileOutputStream(outputFile);
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		
		char[] readString = new char[1000];
		int len = 0;
		while((len = br.read(readString)) != -1) {
			bw.write(readString, 0, len);
		}
		
		bw.flush();
		is.close();
		isr.close();
		br.close();
		os.close();
		osw.close();
		bw.close();
	}
}

