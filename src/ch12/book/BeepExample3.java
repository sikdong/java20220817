package ch12.book;

import java.awt.Toolkit;

public class BeepExample3 {
	public static void main(String[] args) {
		Thread thread = new Thread(()->{
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for (int i = 0; i < 5; i++) {
				toolkit.beep();
				try {
					Thread.sleep(500);
				} catch (Exception e) {}
			}
		});
	}
}
