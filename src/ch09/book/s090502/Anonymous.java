package ch09.book.s090502;

public class Anonymous {
	// 필드 초기값으로 대입
	RemoteControl field = new RemoteControl() {
		public void turnOn() {
			System.out.println("Tv를 켭니다.");
		}
		
		@Override
		public void turnOff() {
			System.out.println("TV를 켭니다.");
		}
	};
	
	void method1() {
		//로컬 변수값으로 대입
		RemoteControl localVar = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("AUDIO를 켭니다.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("Audio를 끕니다.");
			}
			
		};
		
		localVar.turnOn();
	}
	
  void method2(RemoteControl rc) {
	  rc.turnOn();
  }
}
