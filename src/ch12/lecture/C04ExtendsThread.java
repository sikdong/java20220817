package ch12.lecture;

import java.awt.Toolkit;

public class C04ExtendsThread {

}

class Task4 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
		}
		try {
			Thread.sleep(500);
		} catch (Exception e) {}
	}
}

class Task3 extends Thread {
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
		}
		
		try {
			Thread.sleep(500);
		} catch(Exception e){
			
		}
	}
}