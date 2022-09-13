package ch13.lecture.p05wildcard;

import java.util.ArrayList;

public class C08Guideline {
	public static void main(String[] args) {
		// PECS
		// Produce  => extends
		// Consume => super
		
		// g"e"t => "e"xtends
		// p"u"t => s"u"per
		
		
	}
	
	public static void method1(ArrayList<? extends Number> list) {
		Number n1 = list.get(0);
//		list.add(3); //put  안됨
	}
	
	public static void method2(ArrayList<? super Number> list) {
//		Number n1 = list.get(0); //get 안됨
		list.add(3); //put, out, consume
	}
}
