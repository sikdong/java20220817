package ch11.lecture.p05Class;

import java.lang.reflect.Field;

public class C02Reflection {
	public static void main(String[] args) {
		Class c = String.class;
		
		Field[] fields = c.getFields();
		
		for(Field field : fields) {
			System.out.println(field.getName());
		}
		
	}
}
