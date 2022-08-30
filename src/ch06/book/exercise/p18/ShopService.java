package ch06.book.exercise.p18;

public class ShopService {
	private static ShopService serve1 = new ShopService();
	
	private ShopService(){
		
	}
	
	public static ShopService getInstance() {
		return serve1;
	}
}
