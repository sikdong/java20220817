package ch06.book.s060803;

public class Car {
	//필드 
	int speed;
	
	//생성자
	
	//메소드
	int getSpeed() {
		return speed;
	}
	
	void keyTurnOn() {
		System.out.println("시동을 겁니다.");
	}
	
	void run() {
		for (int i = 10; i<= 50; i+=10) {
			speed = i;
			System.out.println("(시속: " + speed + "km/h");
		}
	}
}
