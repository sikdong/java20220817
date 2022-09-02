package ch09.lecture.p02lambda;

import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;

public class MyClass5 {
	public static void main(String[] args) {
		IntConsumer o1 = value -> System.out.println(value * value);
		
		o1.accept(3);
		o1.accept(4);
		
		DoubleConsumer o2 = a -> System.out.println(a/2);

		DoubleConsumer o3 = a -> System.out.println(Math.sqrt(a));
		o2.accept(5); // 2.5
		o2.accept(10); // 5.0
		o2.accept(7); // 3.5
		
		o3.accept(5);
	}
}

