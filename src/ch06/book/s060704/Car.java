package ch06.book.s060704;

public class Car {
	String company = "현대 자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	Car(){
		
	}
	
	Car(String model){
		this.model= model;
	}
	
	Car(String model, String color){
		this.model = model;
		this.color = color; 
	}
	
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
}
