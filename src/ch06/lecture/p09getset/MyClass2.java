package ch06.lecture.p09getset;

	public class MyClass2 {
		//field는 특별한 이유가 없으면 private
		private String name;
		private int age;
		private boolean alive; 
		
		//대신 getter, setter method 공개 (public)
		
		public int getAge() {
			return age;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public boolean isAlive() {
			return alive;
		}

		public void setAlive(boolean alive) {
			this.alive = alive;
		}

		public void setAge(int age) {
			this.age = age;
		}
		
		
	}
